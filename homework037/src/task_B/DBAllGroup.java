package task_B;

import java.sql.*;

public class DBAllGroup {
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

    public static void allGroup(){
        String sql = "SELECT * FROM groups";

        try (Connection conn = connect();
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);) {

            while (rs.next()){
                System.out.print(rs.getString("group_id") + " ");
                System.out.println(rs.getString("group_name"));
            }
        }
        catch (SQLException ex){
            System.out.println(ex.getMessage());
        }
    }
}
