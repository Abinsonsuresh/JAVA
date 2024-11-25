import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBC {

    public static void main(String[] args) {
        // Database credentials
        String jdbcURL = "jdbc:mysql://localhost:3306/testdb"; // Replace 'testdb' with your database name
        String username = "root"; // Replace with your database username
        String password = "password"; // Replace with your database password

        Connection connection = null;
        Statement statement = null;

        try {
            // Step 1: Load the JDBC Driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver loaded successfully!");

            // Step 2: Establish a connection to the database
            connection = DriverManager.getConnection(jdbcURL, username, password);
            System.out.println("Connected to the database!");

            // Step 3: Create a Statement object

            statement = connection.createStatement();

            // Step 4: Execute a SQL query
            String sqlQuery = "SELECT id, name, email FROM users";
            ResultSet result = statement.executeQuery(sqlQuery);

            while (result.next()) {
                int id = result.getInt("id");

            }

            result.close();

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (statement != null)
                    statement.close();

                if (connection != null)
                    connection.close();

            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
    }
}
