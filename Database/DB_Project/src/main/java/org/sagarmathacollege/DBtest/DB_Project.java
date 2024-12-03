// package org.sagarmathacollege.DBtest;

// import java.sql.Connection;
// import java.sql.DriverManager;
// import java.sql.ResultSet;
// import java.sql.SQLException;
// import java.sql.Statement;

// public class DB_Project {

//     // Database connection details
//     private static final String URL = "jdbc:mysql://localhost:3306/Rajendra";
//     private static final String USERNAME = "root";
//     private static final String PASSWORD = "";

//     public static void main(String[] args) {
//         try (Connection connection = DriverManager.getConnection(URL, USERNAME, PASSWORD)) {

//             // Check if the connection is successful
//             if (connection != null) {
//                 System.out.println("Successfully connected to the database!");

//                 // Create table
//                 String createTableSQL = "CREATE TABLE IF NOT EXISTS students ("
//                         + "id INT PRIMARY KEY AUTO_INCREMENT, "
//                         + "name VARCHAR(100), "
//                         + "age INT, "
//                         + "grade CHAR(1))";
//                 try (Statement statement = connection.createStatement()) {
//                     statement.executeUpdate(createTableSQL);
//                     System.out.println("Table 'students' created or already exists.");
//                 }

//                 // Insert some data
//                 String insertDataSQL = "INSERT INTO students (name, age, grade) VALUES "
//                         + "('Rajendra', 21, 'A'), "
//                         + "('Sita', 22, 'B'), "
//                         + "('Ram', 20, 'A')";
//                 try (Statement statement = connection.createStatement()) {
//                     statement.executeUpdate(insertDataSQL);
//                     System.out.println("Sample data inserted.");
//                 }

//                 // Display data
//                 String selectSQL = "SELECT * FROM students";
//                 try (Statement statement = connection.createStatement();
//                      ResultSet resultSet = statement.executeQuery(selectSQL)) {

//                     System.out.println("Displaying student records:");
//                     while (resultSet.next()) {
//                         int id = resultSet.getInt("id");
//                         String name = resultSet.getString("name");
//                         int age = resultSet.getInt("age");
//                         String grade = resultSet.getString("grade");

//                         System.out.printf("ID: %d, Name: %s, Age: %d, Grade: %s%n", id, name, age, grade);
//                     }
//                 }
//             }

//         } catch (SQLException e) {
//             System.err.println("Database connection failed.");
//             System.err.println("Error: " + e.getMessage());
//             e.printStackTrace();
//         }
//     }
// }

package org.sagarmathacollege.DBtest;

import java.sql.ResultSet;
import java.sql.SQLException;

import javax.sql.RowSetEvent;
import javax.sql.RowSetListener;
import javax.sql.rowset.CachedRowSet;
import javax.sql.rowset.JdbcRowSet;
import javax.sql.rowset.RowSetProvider;

public class DB_Project {

    // Database connection details
    private static final String URL = "jdbc:mysql://localhost:3306/Rajendra";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "";

    public static void main(String[] args) {
        try {
            // Using JdbcRowSet
            JdbcRowSet jdbcRS = RowSetProvider.newFactory().createJdbcRowSet();
            jdbcRS.setUrl(URL);
            jdbcRS.setUsername(USERNAME);
            jdbcRS.setPassword(PASSWORD);
            jdbcRS.setCommand("SELECT * FROM students");
            jdbcRS.setType(ResultSet.TYPE_SCROLL_INSENSITIVE);
            jdbcRS.execute();

            // Add RowSetListener to handle events
            jdbcRS.addRowSetListener(new RowSetListener() {
                @Override
                public void cursorMoved(RowSetEvent event) {
                    try {
                        // Handling cursorMoved event
                        System.out.println("Cursor moved: ");
                        System.out.println("ID = " + jdbcRS.getInt("id"));
                        System.out.println("Name = " + jdbcRS.getString("name"));
                        System.out.println("Age = " + jdbcRS.getInt("age"));
                        System.out.println("Grade = " + jdbcRS.getString("grade"));
                    } catch (SQLException e) {
                        System.err.println("Error while fetching row: " + e.getMessage());
                        e.printStackTrace();
                    }
                }

                @Override
                public void rowChanged(RowSetEvent event) {
                    // Handle rowChanged event if needed
                }

                @Override
                public void rowSetChanged(RowSetEvent event) {
                    // Handle rowSetChanged event if needed
                }
            });

            // Iterate through the results
            while (jdbcRS.next()) {
                // Each call to next generates a cursorMoved event
                System.out.println("Cursor Moved: ");
                System.out.println("ID = " + jdbcRS.getInt("id"));
                System.out.println("Name = " + jdbcRS.getString("name"));
                System.out.println("Age = " + jdbcRS.getInt("age"));
                System.out.println("Grade = " + jdbcRS.getString("grade"));
            }

            // Using CachedRowSet
            CachedRowSet cachedRS = RowSetProvider.newFactory().createCachedRowSet();
            cachedRS.setUrl(URL);
            cachedRS.setUsername(USERNAME);
            cachedRS.setPassword(PASSWORD);
            cachedRS.setCommand("SELECT * FROM students");
            cachedRS.execute();

            // Iterate through CachedRowSet
            System.out.println("\nUsing CachedRowSet:");
            while (cachedRS.next()) {
                System.out.println("ID = " + cachedRS.getInt("id"));
                System.out.println("Name = " + cachedRS.getString("name"));
                System.out.println("Age = " + cachedRS.getInt("age"));
                System.out.println("Grade = " + cachedRS.getString("grade"));
            }

        } catch (SQLException e) {
            // Catching and printing more specific exceptions
            System.err.println("Database operation failed: " + e.getMessage());
            e.printStackTrace();
        } finally {
            // Optional: You could close any resources if necessary here (not required in this case since JdbcRowSet & CachedRowSet handle that internally)
            System.out.println("Operation completed, resources cleaned up if necessary.");
        }
    }
}
