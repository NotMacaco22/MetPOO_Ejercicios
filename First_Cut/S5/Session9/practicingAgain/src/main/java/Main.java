import dao.StudentDao;
import models.Student;

import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        StudentDao studentDao = new StudentDao();

        String menu = "1. Add Student\n"
                + "2. Show All Students\n"
                + "3. Search Student\n"
                + "4. Average Age\n"
                + "5. Exit\n";

        int opc = 0;

        while (opc != 4){

            System.out.println(menu);
            System.out.print("Enter your choice: ");

            try{
                opc = scanner.nextInt();

                switch (opc) {
                    case 1:
                        System.out.print("Enter Student Name: ");
                        String name = scanner.next();
                        System.out.print("Enter Student Age: ");
                        int age = scanner.nextInt();
                        System.out.print("Enter Student Email: ");
                        String email = scanner.next();
                        Student student = new Student(name, age, email);
                        studentDao.store(student);
                        break;

                    case 2:
                        System.out.println(" ~ All Students ~ ");
                        studentDao.showStudents();
                        break;

                    case 3:
                        System.out.print("Enter Student Name (To Search It): ");
                        String nameSearch = scanner.next();
                        studentDao.findByName(nameSearch);
                        break;

                    case 4:
                        System.out.println(" ~ All Students ~");
                        studentDao.showAges();
                        System.out.println("\nAverage Student Age: " + studentDao.averageAge());
                        break;

                    case 5:
                        System.out.println("See youu <3");
                        break;

                    default:
                        System.out.println("Not valid option - Please try again");
                        break;
                }
            } catch (Exception e){
                System.out.println(e.getMessage());
            }
        }
    }
}
