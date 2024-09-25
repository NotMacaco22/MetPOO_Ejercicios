package org.cash;

import org.cash.dao.StudentDAO;
import org.cash.models.Student;

public class Main {

    public static void main(String[] args){

        // Date Format MM/DD/YYYY
        System.out.println("Session 09/24/2024");

        Student yo = new Student("22011275", "Cesar", "Silva", "casilva@uamv.edu.ni", "88888888");
        Student karen = new Student("23010471", "Karen", "Fonseca", "karen@uamv.edu.ni", "99999999");
        Student andres = new Student("22020330", "Andres", "Martinez", "andres@uamv.edu.ni", "77777777");

        StudentDAO listStd = new StudentDAO();

        System.out.println("~ Adding Students ~");
        listStd.create(yo);
        listStd.create(karen);
        listStd.create(andres);

        for (Student student : listStd.showList()){
            System.out.println(student);
        }

        System.out.println("~ Adding a New Student ~");
        Student silvio = new Student("12345678", "Silvio", "Mora", "silvio@uamv.edu.ni", "33553553");
        listStd.create(silvio);

        System.out.println("~ Students Again ~");
        for (Student student : listStd.showList()){
            System.out.println(student);
        }

        System.out.println("Updating Student");
        silvio.setLastName("Morita");
        silvio.setEmail("morita@uamv.edu.ni");
        listStd.update(silvio);

        System.out.println("~ Students Again ~");
        for (Student student : listStd.showList()){
            System.out.println(student);
        }

        listStd.delete(silvio.getCif());

        System.out.println("~ Students Again ~");
        for (Student student : listStd.showList()){
            System.out.println(student);
        }

    }

}
