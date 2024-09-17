import dao.StudentDao;
import models.Student;

public class Main {

    public static void main(String[] args){

        Student std1 = new Student("Cesar", 19, "casilva@uamv.edu.ni");
        Student std2 = new Student("Karen", 20, "kmryfonseca@uamv.edu.ni");
        Student std3 = new Student("Silvio", 19, "samora@uamv.edu.ni");

        StudentDao students = new StudentDao();

        if (students.store(std1)){
            System.out.println("Student Saved Successfully");
        } else {
            System.out.println("An error occured");
        }

        if (students.store(std2)){
            System.out.println("Student Saved Successfully");
        } else {
            System.out.println("An error occured");
        }

        if (students.store(std3)){
            System.out.println("Student Saved Successfully");
        } else {
            System.out.println("An error occured");
        }

        students.showStudents();

    }
}
