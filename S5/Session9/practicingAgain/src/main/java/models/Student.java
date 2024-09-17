package models;

import java.util.Objects;

public class Student {

    private String name;
    private int age;
    private String email;

    // Constructors (Empty And With All Fields)
    public Student() {
    }
    public Student(String name, int age, String email) {
        this.name = name;
        this.age = age;
        this.email = email;
    }

    // Getters And Setters
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    // To-String
    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", email='" + email + '\'' +
                '}';
    }

    //Equals (Useful to compare if the object exists)
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age && Objects.equals(name, student.name) && Objects.equals(email, student.email);
    }

    //Hash Code (Makes a unique identifier nad encrypted :D)
    @Override
    public int hashCode() {
        return Objects.hash(name, age, email);
    }
}
