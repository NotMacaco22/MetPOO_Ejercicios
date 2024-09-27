package org.cesar;

import java.sql.*;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {

        // To show the drivers installed, we only care about postgresql driver, if the driver is printed on the terminal then no problem :)
        DriverManager.drivers().forEach((driver) -> System.out.println(driver.toString()));

        try {
            Connection c = DriverManager.getConnection("jdbc:postgresql://localhost/testing", "Credential_User", "Credential_Passwprd");
            System.out.println("\nIs Closed? - " + c.isClosed());
            System.out.println("Product Name: " + c.getMetaData().getDatabaseProductName() + "\n");

            // Testing a query through java.sql with the help of the driver 
            String query = "SELECT id, nombre FROM prueba";
            Statement stmt = c.createStatement();
            ResultSet rs = stmt.executeQuery(query);

            while (rs.next()) { // While more rows keep printing 
                int id = rs.getInt("id");
                String nombre = rs.getString("nombre");
                System.out.println("ID: " + id + " | Nombre: " + nombre);
            }

            c.close();
            System.out.println("\nIs Closed? - " + c.isClosed());

        } catch (SQLException sqlexception) { // Exception if there's an error trying to connect to the databas
            SQLException e = sqlexception;
            System.out.println("There was an error trying to connect to the database.\n" + e.getMessage());
        }
    }
}
