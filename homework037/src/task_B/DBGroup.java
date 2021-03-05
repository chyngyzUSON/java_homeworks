package task_B;

import java.sql.*;

public class DBGroup {
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

    public static void countStudents(){
        String sql = "SELECT groups.group_name, students.student_full_name, COUNT(student_id) " +
                "FROM groups" +
                "INNER JOIN students" +
                "ON groups.group_id = students.group_id" +
                "WHERE group_id = 1" +
                "GROUP BY groups.group_name, students.student_full_name";

        try (Connection conn = connect();
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);) {

            System.out.println("В группе " + rs.next() + "студентов");
        }
        catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
