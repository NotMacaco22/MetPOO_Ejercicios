package models;

import java.util.ArrayList;
import java.util.List;

public class Department {

    private String name;
    private List<Teacher> teachers;

    public Department() {
        //Mandatory, 'cause before i'm just putting the variable, here i'm creating it
        teachers=new ArrayList<>();
        //ArrayList provides lot more functions, like add, search, etc, idk tbh
    }

    public Department(String name, List<Teacher> teachers) {
        this.name = name;
        this.teachers = teachers;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Teacher> getTeachers() {
        return teachers;
    }

    public void setTeachers(List<Teacher> teachers) {
        this.teachers = teachers;
    }

    public void addTeacher(Teacher teacher) {
        teachers.add(teacher);
    }


}
