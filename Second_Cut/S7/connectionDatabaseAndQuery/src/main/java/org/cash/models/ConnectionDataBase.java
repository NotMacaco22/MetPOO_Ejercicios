package org.cash.models;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionDataBase {

    private static ConnectionDataBase instance;
    private Connection connection;
    private final String url = "jdbc:postgresql://localhost/testing";
    private final String user = "username";
    private final String password = "password";

    private ConnectionDataBase() {
        try {
            connection = DriverManager.getConnection(url, user, password);
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Error: " + e.getMessage());
        }
    }

    // Synchronized, means that only one thread can execute it at once, so, only one thread can a new instance if it doesn't  exist.
    public static synchronized ConnectionDataBase getInstance() {
        if (instance == null) {
            instance = new ConnectionDataBase();
        }
        return instance;
    }

    public Connection getConnection() throws SQLException {
        return DriverManager.getConnection(url, user, password);
    }

    public void closeConnection() {
        if (connection != null) {
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }


}
