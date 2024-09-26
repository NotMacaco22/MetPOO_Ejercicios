package dao;

// DAO
// Data
// Access
// Object

import interfaces.Session9;
import models.Student;

import java.util.ArrayList;

public class StudentDao implements Session9 {

    ArrayList<Student> students = new ArrayList<>();

    @Override
    public boolean store(Object obj) {
        //Casting the variable Object to Student
        Student student = (Student) obj;

        //Handling Exception
        try {
            //First of all, it tries to add a student
            //If there is no errors then cool :D
            students.add(student);
            return true;
        } catch (Exception e) {
            //But if there's an error not cool :(
            return false;
        }

    }

    @Override
    public void findByName(String name) {

        try {
            for (Student student : students) {
                if (student.getName().equals(name)) {
                    System.out.println(student);
                    // Without this break it will always show couldn't find message
                    break;
                }
                System.out.println("Couldn't find student with name " + name);
            }
        } catch (Exception e) {
            System.out.println("An error occurs trying to find student with name " + name + "\nError: " + e.getMessage());
        }

    }

    public void showStudents() {
        for (Student student : students) {
            System.out.println(student);
        }
    }

    public void showAges() {
        for (Student student : students) {
            System.out.println("Name: " + student.getName() + " | Age:" + student.getAge());
        }
    }

    public float averageAge() {
        float average = 0;
        int count = 0;
        for (Student student : students) {
            try {
                average += student.getAge();
                count++;
            } catch (Exception e) {
                System.out.println("An error occurs trying to find student with age " + student.getAge());
            }
        }
        return average/count;
    }



}
