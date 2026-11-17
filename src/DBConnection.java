import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {
    public static Connection getConnection() {
        try {
            String url = "jdbc:sqlserver://localhost:1433;databaseName=cc_pizza_db;encrypt=true;trustServerCertificate=true;";
            String username = "sa";
            String password = "YourStrongPassword123"; // ඔබගේ SQL Server පාස්වර්ඩ් එක දෙන්න
            return DriverManager.getConnection(url, username, password);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}