import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class UserInformation {
    public static void main(String[] args) {
        String jdbcUrl = "jdbc:mysql://localhost:3306/user_db01";
        String username = "root";
        String password = "root";

        try {
            // Connect to database
            Connection connection = DriverManager.getConnection(jdbcUrl, username, password);
            System.out.println("Connected to database");

            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter your name: ");
            String name = scanner.nextLine();
            System.out.print("Enter your email: ");
            String email = scanner.nextLine();

            // SQL query to insert user information
            String sql = "INSERT INTO users (name, email) VALUES (?, ?)";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, name);
            statement.setString(2, email);

            // Execute the query
            int rows = statement.executeUpdate();
            if (rows > 0) {
                System.out.println("A new user has been inserted.");
            }

            // Close connection
            connection.close();
        } catch (SQLException e) {
            System.out.println("An error occurred");
            e.printStackTrace();
        }
    }
}
