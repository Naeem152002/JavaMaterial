package com.androjava.dbconnection;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public final class ConnectionProvider {
    private static Connection connection;

    private ConnectionProvider() {
    }

    public static synchronized Connection getConnection() {
        if (connection == null) {
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc", "root", "1234");
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return connection;
    }
}
