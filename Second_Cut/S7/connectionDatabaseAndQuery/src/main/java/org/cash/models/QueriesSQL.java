package org.cash.models;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Date;

public class QueriesSQL {

    public void allInfoStudents(){

        String query = "SELECT * FROM alumnos";

        try(Connection connection = ConnectionDataBase.getInstance().getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            ResultSet resultSet = preparedStatement.executeQuery()){
            while(resultSet.next()){
                int id = resultSet.getInt("id_alumno");
                String name = resultSet.getString("name");
                String date = resultSet.getString("birth_date");
                System.out.println("Student ID: " + id + " | Name: " + name + " | Birth Date: " + date);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void insertStudent(String name, String birth_date){
        String insertQuery = "INSERT INTO alumnos (name, birth_date) VALUES (?, ?)";
        try(Connection connection = ConnectionDataBase.getInstance().getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(insertQuery)){

            preparedStatement.setString(1, name);
            preparedStatement.setDate(2, Date.valueOf(birth_date));
            preparedStatement.executeUpdate();

        } catch (SQLException e){
            e.printStackTrace();
        }

    }



}
