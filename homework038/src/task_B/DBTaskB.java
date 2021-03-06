package task_B;

import task_B.City;
import task_B.Country;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DBTaskB {
    private final static String url = "jdbc:postgresql://localhost:5432/postgres";
    private final static String user = "postgres";
    private final static String password = "5454";

    public static Connection connect(){
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(url, user, password);
            System.out.println("Connected successfully/Подключено успешно");
        }
        catch (SQLException ex){
            System.out.println(ex.getMessage());
        }
        return conn;
    }

    public static boolean insertCountry(int id, String name, String countryCode, int countryPopulation){
        String sql = "INSERT INTO countries(country_id, country_name, country_code, country_population) " +
                "VALUES(?, ?, ?, ?)";

        int result = 0;
        try(Connection conn = connect();
            PreparedStatement stmt = conn.prepareStatement(sql)){

            stmt.setInt(1, id);
            stmt.setString(2, name);
            stmt.setString(3, countryCode);
            stmt.setInt(4, countryPopulation);

            result = stmt.executeUpdate();
        }
        catch (SQLException ex){
            System.out.println(ex.getMessage());
        }
        return result > 0;
    }

    public static boolean insertCity(int id, String name, int countryId, int mayor, int cityPopulation){
        String sql = "INSERT INTO cities(city_id, city_name, country_id, mayor, city_population) " +
                "VALUES (?, ?, ?, ?, ?)";
        int result = 0;

        try(Connection conn = connect();
            PreparedStatement stmt = conn.prepareStatement(sql)){

            stmt.setInt(1, id);
            stmt.setString(2, name);
            stmt.setInt(3, countryId);
            stmt.setInt(4, mayor);
            stmt.setInt(5, cityPopulation);

            result = stmt.executeUpdate();
        }catch (SQLException ex){
            System.out.println(ex.getMessage());
        }
        return result > 0;
    }

    public static List<City> getCitiesWithCountries(){
        String sql = "SELECT * FROM cities c " +
                     "JOIN countries cn ON cn.country_id = c.country_id";
        List<City> cities = new ArrayList<>();
        try(Connection conn = connect();
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql)){

            while (rs.next()){
                Country country = new Country(rs.getInt("country_id"), rs.getString("country_name"),
                        rs.getString("country_code"), rs.getInt("country_population"));
                City city = new City(rs.getInt("city_id"), rs.getString("city_name"),
                        country, rs.getInt("city_population"));

                cities.add(city);
            }
        }catch (SQLException ex){
            System.out.println(ex.getMessage());
        }
        return cities;
    }

    public static List<City> getCitiesByLength(int length){
        String sql = "SELECT * FROM cities c " +
                "JOIN countries cn ON cn.country_id = c.country_id " +
                "WHERE length(city_name) > ?";
        List<City> cities = new  ArrayList<>();

        try(Connection conn = connect();
            PreparedStatement stmt = conn.prepareStatement(sql)){

            stmt.setInt(1, length);

            try(ResultSet rs = stmt.executeQuery()){
                while (rs.next()){
                    Country country = new Country(rs.getInt("country_id"), rs.getString("country_name"),
                            rs.getString("country_code"), rs.getInt("country_population"));
                    City city = new City(rs.getInt("city_id"), rs.getString("city_name"),
                            country, rs.getInt("city_population"));

                    cities.add(city);
                }
            }
            catch (SQLException ex){
                System.out.println(ex.getMessage());
            }
        }
        catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return cities;

    }
}
