package org.cesar;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {

        // To show the drivers installed, we only care about postgresql driver, if the driver is printed on the terminal then no problem :)
        DriverManager.drivers().forEach((driver) -> System.out.println(driver.toString()));

        try {
            Connection c = DriverManager.getConnection("jdbc:postgresql://localhost/testing", "UserCredentials", "UserCredentialsButPassword");
            System.out.println("Is Closed? - " + c.isClosed());
            System.out.println("Product Name: " + c.getMetaData().getDatabaseProductName());
            c.close();
            System.out.println("Is Closed? - " + c.isClosed());
        } catch (SQLException sqlexception) {
            SQLException e = sqlexception;
            System.out.println("There was an error trying to connect to the database.\n" + e.getMessage());
        }

    }
}
