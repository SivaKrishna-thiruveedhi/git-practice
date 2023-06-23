package org.cglia.jdbc_transactions;
import java.sql.*;

public class Example1 {
    public static void main(String[] args) {
        String url = "jdbc:mysql://192.168.60.22:3306/siva_krishna?user=sivakrishna&password=siva@123456";
 
        Connection connection = null;
        Statement statement = null;

        try {
            // Establish the connection
            connection = DriverManager.getConnection(url);
            
            // 1. Disable auto-commit mode
            connection.setAutoCommit(false);
            
            // Create a statement object
            statement = connection.createStatement();
            
            // Perform database operations within a transaction
            statement.executeUpdate("INSERT INTO employees (id, name, age) VALUES (101, 'John Doe', 30)");
            statement.executeUpdate("UPDATE employees SET age = 35 WHERE id = 101");
            
            // Commit the transaction
            connection.commit();
            
            System.out.println("Transaction committed successfully.");
        } catch (SQLException e) {
            // Rollback the transaction in case of any error
            try {
                if (connection != null)
                    connection.rollback();
                System.err.println("Transaction rolled back.");
            } catch (SQLException ex) {
                System.err.println("Error occurred during rollback: " + ex.getMessage());
            }
        } finally {
            // Close the resources
            try {
                if (statement != null)
                    statement.close();
                if (connection != null)
                    connection.close();
            } catch (SQLException e) {
                System.err.println("Error "
                	+ "occurred while closing "
                	+ "resources: " + e.getMessage());
            }
        }
    }
}
