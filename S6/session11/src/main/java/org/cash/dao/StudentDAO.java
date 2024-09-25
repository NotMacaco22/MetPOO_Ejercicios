package org.cash.dao;

import org.cash.interfaces.Operations;
import org.cash.models.Student;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class StudentDAO implements Operations {

    private ArrayList<Student> students = new ArrayList<>();
    private Map<String, Student> studentsMap = new HashMap<>();

    /**
     * Add a New Student
     * @param object
     * */
    @Override
    public void create(Object object) {
        try{
            Student student = (Student) object;
            students.add(student);
        } catch (Exception e) {
            System.out.println("There was an error trying to add the student.\nError: " + e.getMessage());
        }
    }

    @Override
    public ArrayList<Object> read() {
        return null;
    }

    public ArrayList<Student> showList() {
        return students;
    }


    @Override
    public void update(Object object) {

        //Update Student
        Student student = (Student) object;

        for (Student std : students) {
            if (std.getCif().equals(student.getCif())) {
                std.setFirstName(student.getFirstName());
                std.setLastName(student.getLastName());
                std.setEmail(student.getEmail());
                std.setPhoneNumber(student.getPhoneNumber());
                return;
            }
        }
    }


    @Override
    public void delete(String cif) {

        try{
            // This function delete all the objects that match the cif (not completely useless because in theory cif is unique so :))
            students.removeIf(cifToDelete -> cifToDelete.getCif().equals(cif));
        } catch (Exception e) {
            System.out.println("There was an error trying to delete the student.\nError: " + e.getMessage());
        }

    }

    @Override
    public Object search(String value) {

        for (Student std : students) {
            if (std.getCif().equals(value) || std.getFirstName().equals(value) || std.getLastName().equals(value)) {
                return std;
            }
        }
        return null;
    }

}
