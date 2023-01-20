import java.sql.*;
public class Example {
    private static final String PASSWORD = "mysecretpassword";
    public static void main(String[] args) {
        try {
            // Connect to the database
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3550/orcl", "username", PASSWORD);
            // Do something with the connection
            // ...
            // Close the connection
            conn.close();
        } catch (SQLException e) {
            System.err.println("Error connecting to the database: " + e.getMessage());
        }
    }
}
