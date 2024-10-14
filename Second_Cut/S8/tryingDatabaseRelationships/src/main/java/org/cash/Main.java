package org.cash;

import org.cash.dao.FacultyDAO;
import org.cash.dao.MajorDAO;
import org.cash.dao.StudentDAO;
import org.cash.models.Faculty;
import org.cash.models.Major;
import org.cash.models.Student;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
//        Faculty faculty = new Faculty("FIA");
//        FacultyDAO facultyDAO = new FacultyDAO();
//        facultyDAO.saveFaculty(faculty);
//        System.out.println(facultyDAO.search(1L));
//        System.out.println(facultyDAO.search("FCAE"));
//
//        if (facultyDAO.search("FCE") != null) {
//            System.out.println(facultyDAO.search("FCAE").toString());
//        } else {
//            System.out.println("No faculty found");
//        }
//        facultyDAO.getAllFaculties().forEach(System.out::println);
//        facultyDAO.deleteFaculty(3L);
//        facultyDAO.getAllFaculties().forEach(System.out::println);
//        MajorDAO majorDAO = new MajorDAO();
//        Major m = new Major(1L, "Arqui");
//        majorDAO.saveMajor(m);
//        FacultyDAO facultyDAO = new FacultyDAO();
//        Faculty f = new Faculty("FIA");
//        facultyDAO.saveFaculty(f);
//
//        Faculty faculty = new Faculty("FCAE");
//        FacultyDAO facultyDAO = new FacultyDAO();
//        facultyDAO.saveFaculty(faculty);
//
//        Major major = new Major("Admin. Emp", 2L);
//        MajorDAO majorDAO = new MajorDAO();
//        majorDAO.saveMajor(major);

//        FacultyDAO facultyDAO = new FacultyDAO();
//        Faculty faculty = new Faculty("FIA");
//        facultyDAO.saveFaculty(faculty);
////
//        System.out.println(facultyDAO.search("FIA"));
//        Major major = new Major("Sistemas", facultyDAO.search("FIA"));
//        MajorDAO majorDAO = new MajorDAO();
////        majorDAO.saveMajor(major);

        Faculty faculty = new Faculty("FIA");
        FacultyDAO facultyDAO = new FacultyDAO();
        facultyDAO.saveFaculty(faculty);


    }
}
