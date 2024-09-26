import models.*;

public class Main {

    public static void main(String[] args) {

        // If I don't want to create an empty constructor I can do this ( Course curso )
        // instead of the line 11 ( Course curso = new Course() )

        System.out.println("*".repeat(20));System.out.println();

        Course course = new Course();
        Teacher duran = new Teacher();
        Department fia = new Department();
        Car car = new Car();

        Dog perritoo = new Dog();
        Cat gatitoo = new Cat();

        course.setName("POO I");
        duran.setName("Jose Duran");

        duran.teaching(course);

        fia.setName("FIA");

        Teacher noel = new Teacher();
        noel.setName("Noel");

        fia.addTeacher(noel);
        fia.addTeacher(duran);

        //For-Each Loop
        for (Teacher teacher : fia.getTeachers()){
            System.out.println(teacher.getName());
        }

        System.out.println();

        perritoo.eat();
        perritoo.makeNoise();
        perritoo.setNombre("Puki");
        perritoo.myName();

        System.out.println();

        gatitoo.eat();
        gatitoo.makeNoise();
        gatitoo.setNombre("Michu");
        gatitoo.myName();

        System.out.println();

        car.turnCarOn();
        car.turnCarOff();




    }

}