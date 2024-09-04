import models.Admission;
import models.Student;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Student student = new Student();
//        Student student2 = new Student();
        Admission admission = new Admission();
        Scanner sc = new Scanner(System.in);

        float avg;
//
//        System.out.println("~ Students History ~");
//        System.out.print("Put your CRA: ");
//        avg = sc.nextFloat();
//        student.setAverage(avg);
//
//        admission.calcScholarship(student);
//
//        String a = student.isHasSchoolarship() ? "can" : "cannot";
//        System.out.println("You " + a + " apply for an scholarship.");
//
//
//        student2.setAverage(90);
//
        ArrayList<Student> studentsArray = new ArrayList<>();
//        studentsArray.add(student);
//        studentsArray.add(student2);
//
//        for (Student s : studentsArray) {
//            System.out.println(s.getAverage());
//        }

        for (int i = 0; i < 5; i++){
            Student student = new Student();
            System.out.print("Name: "); avg = sc.nextFloat();
            student.setAverage(avg);
            admission.calcScholarship(student);
            studentsArray.add(student);
        }

//        for (Student student : studentsArray){
//            System.out.println(student.getAverage() + " | " + student.setHasSchoolarship());
//        }



        for (Student student : studentsArray){
            System.out.println( student.getAverage() + " | " + student.isHasSchoolarship() );
        }

    }
}