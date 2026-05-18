package rvt;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.SQLException;

public class AppTest {
    public static void main(String[] args) {
        try (
            Connection connection = DriverManager.getConnection("jdbc:sqlite:todo.db");
            Statement statement = connection.createStatement();  
        )
        {
            String sql = "CREATE TABLE todo" + "(id INTEGER PRIMARY KEY, task TEXT NOT NULL, phone INTEGER) STRICT";
            statement.executeUpdate(sql);  // Use the connection
        } 
        catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
