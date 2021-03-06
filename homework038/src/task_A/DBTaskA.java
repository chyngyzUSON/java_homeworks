package task_A;

import java.sql.*;
import java.util.List;

public class DBTaskA {
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

    public static void insertCities(List<CityA> cityAList){
        String sql = "INSERT INTO city(city_id, city_name) values(?, ?)";

        try(Connection conn = connect();
            PreparedStatement preparedStatement = conn.prepareStatement(sql)){

            for (CityA cityA : cityAList){
                preparedStatement.setInt(1, cityA.getId());
                preparedStatement.setString(2, cityA.getCityName());
                preparedStatement.execute();
            }
        }
        catch (SQLException ex){
            System.out.println(ex.getMessage());
        }
    }

    public static boolean hasCitiesById(int id){
        String sql = "SELECT * FROM city WHERE city_id = ?";

        try(Connection connection = connect();
            PreparedStatement preparedStatement = connection.prepareStatement(sql)){
            preparedStatement.setInt(1, id);
            ResultSet rs = preparedStatement.executeQuery();
            int counter = 0;
            while (rs.next()){
                counter++;
            }
            return counter > 0;
        }
        catch (SQLException ex){
            System.out.println(ex.getMessage());
            return false;
        }
    }

    public static void insertOrUpdateCities(List<CityA> city){
        String insertSQL = "INSERT INTO city(city_id, city_name) values(?, ?)";
        String updateSQL = "UPDATE city SET city_name = ? WHERE city_id";

        for (CityA cityA : city) {
            boolean hasCity = hasCitiesById(cityA.getId());

            try (Connection connection = connect()){
                if (hasCity) {
                    //метод.обновитьГорода(город)
                    PreparedStatement preparedStatement = connection.prepareStatement(updateSQL);
                    preparedStatement.setString(1, cityA.getCityName());
                    preparedStatement.setInt(2, cityA.getId());
                    preparedStatement.execute();
                    preparedStatement.close();
                } else {
                    //метод.добавитьГорода(город)
                    PreparedStatement preparedStatement = connection.prepareStatement(insertSQL);
                    preparedStatement.setInt(1, cityA.getId());
                    preparedStatement.setString(2, cityA.getCityName());
                    preparedStatement.execute();
                    preparedStatement.close();
                }
            } catch (SQLException ex){
                System.out.println(ex.getMessage());
            }

        }


    }















//    public static boolean insertCountry(int id, String name, String countryCode, int countryPopulation){
//        String sql = "INSERT INTO countries(country_id, country_name, country_code, country_population) " +
//                "VALUES(?, ?, ?, ?)";
//
//        int result = 0;
//        try(Connection conn = connect();
//            PreparedStatement stmt = conn.prepareStatement(sql)){
//
//            stmt.setInt(1, id);
//            stmt.setString(2, name);
//            stmt.setString(3, countryCode);
//            stmt.setInt(4, countryPopulation);
//
//            result = stmt.executeUpdate();
//        }
//        catch (SQLException ex){
//            System.out.println(ex.getMessage());
//        }
//        return result > 0;
//    }
//
//    public static boolean insertCity(int id, String name, int countryId, int mayor, int cityPopulation){
//        String sql = "INSERT INTO cities(city_id, city_name, country_id, mayor, city_population) " +
//                "VALUES (?, ?, ?, ?, ?)";
//        int result = 0;
//
//        try(Connection conn = connect();
//            PreparedStatement stmt = conn.prepareStatement(sql)){
//
//            stmt.setInt(1, id);
//            stmt.setString(2, name);
//            stmt.setInt(3, countryId);
//            stmt.setInt(4, mayor);
//            stmt.setInt(5, cityPopulation);
//
//            result = stmt.executeUpdate();
//        }catch (SQLException ex){
//            System.out.println(ex.getMessage());
//        }
//        return result > 0;
//    }
//
//    public static List<City> getCitiesWithCountries(){
//        String sql = "SELECT * FROM cities c " +
//                     "JOIN countries cn ON cn.country_id = c.country_id";
//        List<City> cities = new ArrayList<>();
//        try(Connection conn = connect();
//            Statement stmt = conn.createStatement();
//            ResultSet rs = stmt.executeQuery(sql)){
//
//            while (rs.next()){
//                Country country = new Country(rs.getInt("country_id"), rs.getString("country_name"),
//                        rs.getString("country_code"), rs.getInt("country_population"));
//                City city = new City(rs.getInt("city_id"), rs.getString("city_name"),
//                        country, rs.getInt("city_population"));
//
//                cities.add(city);
//            }
//        }catch (SQLException ex){
//            System.out.println(ex.getMessage());
//        }
//        return cities;
//    }
//
//    public static List<City> getCitiesByLength(int length){
//        String sql = "SELECT * FROM cities c " +
//                "JOIN countries cn ON cn.country_id = c.country_id " +
//                "WHERE length(city_name) > ?";
//        List<City> cities = new  ArrayList<>();
//
//        try(Connection conn = connect();
//            PreparedStatement stmt = conn.prepareStatement(sql)){
//
//            stmt.setInt(1, length);
//
//            try(ResultSet rs = stmt.executeQuery()){
//                while (rs.next()){
//                    Country country = new Country(rs.getInt("country_id"), rs.getString("country_name"),
//                            rs.getString("country_code"), rs.getInt("country_population"));
//                    City city = new City(rs.getInt("city_id"), rs.getString("city_name"),
//                            country, rs.getInt("city_population"));
//
//                    cities.add(city);
//                }
//            }
//            catch (SQLException ex){
//                System.out.println(ex.getMessage());
//            }
//        }
//        catch (SQLException ex) {
//            System.out.println(ex.getMessage());
//        }
//        return cities;
//
//    }
}
