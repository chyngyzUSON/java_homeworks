package task_A;

import java.sql.*;

public class DBIfMore {
    private static final String url = "jdbc:postgresql://localhost:5432/postgres";
    private static final String user = "postgres";
    private static final String password = "5454";

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

    public static void ifMore(){
        String sql = "SELECT * FROM trainers";

        try (Connection conn = connect();
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);) {

            while (rs.next()) {
                String trainerName = rs.getString("trainer_full_name");
                if (trainerName.length() > 3) {
                    System.out.println("молодец");
                }
            }
        }
        catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
