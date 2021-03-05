package task_A;

import java.sql.*;

public class DBShowTrainers {
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


    public static void showTrainers(){
        String sql = "SELECT * FROM trainers";

        try (Connection conn = connect();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql);) {

            while (rs.next()) {
                String trainerName = rs.getString("trainer_full_name");
                if (trainerName.length() > 3) {
                    System.out.println("молодец");
                }
                System.out.print(rs.getString("trainer_full_name") + " ");
                System.out.print(rs.getString("salary"));
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
