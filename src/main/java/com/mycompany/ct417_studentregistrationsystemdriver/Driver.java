/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ct417_studentregistrationsystemdriver;

import java.util.ArrayList;
import org.joda.time.*;
import com.mycompany.ct417_studentregistrationsystem.*;

public class Driver {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        ArrayList<Student> EEEStudents = new ArrayList<>();
        ArrayList<Student> ECEStudents = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            Student studentsample = new Student("Simon Cuddihy", 24, new DateTime(1993, 11, 10, 0, 0, 0), 12456772);
            ECEStudents.add(studentsample);
        }

        for (int i = 0; i < 3; i++) {
            Student studentsample = new Student("Mark Twain", 23, new DateTime(1994, 3, 9, 0, 0, 0), 13456772);
            EEEStudents.add(studentsample);
        }

        Module SoftwareEngineering = new Module("Software Engineering", "CT417", ECEStudents);
        Module MachineLearning = new Module("Machine Learning & Data Mining", "CT475", ECEStudents);
        Module SoC = new Module("System on Chip", "EE45", ECEStudents);
        Module DSP = new Module("Digital Signal Processing", "EE445", ECEStudents);
        Module PowerElectronics = new Module("Power Electronics", "EE457", EEEStudents);
        Module PowerSystems = new Module("Power Systems", "EE456", EEEStudents);

        ArrayList<Module> ECEModules = new ArrayList<>();
        ArrayList<Module> EEEModules = new ArrayList<>();

        ECEModules.add(SoftwareEngineering);
        ECEModules.add(MachineLearning);
        ECEModules.add(DSP);
        ECEModules.add(SoC);

        EEEModules.add(DSP);
        EEEModules.add(SoC);
        EEEModules.add(PowerSystems);
        EEEModules.add(PowerElectronics);

        DateTime startDate = new DateTime(2014, 9, 01, 0, 0, 0);
        DateTime endDate = new DateTime(2018, 8, 30, 0, 0, 0);

        Course ECE;
        ECE = new Course("Electronic and Computer Engineering", ECEModules, startDate, endDate);

        Course EEE;
        EEE = new Course("Electronic and Electrical Engineering", EEEModules, startDate, endDate);

        createCourse(EEEStudents, EEEModules, EEE);
        createCourse(ECEStudents, ECEModules, ECE);

        printoutCourseProgrammeStudents(ECEStudents);
        printoutCourseProgrammeStudents(ECEStudents);
    }

    public static void createCourse(ArrayList<Student> students, ArrayList<Module> modules, Course course) {
        for (Module module : modules) {
            module.addStudents(students);
        }
        for(Student student : students) {
            student.addStudentocourse(course);
        }
    }

    public static void printoutCourseProgrammeStudents(ArrayList<Student> stu) {
        for(Student student : stu) {

            printStudent(student);
            Course course = student.getCourse();
            System.out.println("Course Programme: " + course.getCourseName());
            System.out.println("Modules:" + getModuleNames(course.getModules()));
            System.out.println();
        }
    }

    public static void printStudent(Student stu) {

        System.out.println("Name: " + stu.getName());
        System.out.println("Username: " + stu.getUsername());
        System.out.println("Id: " + stu.getID());
        System.out.println("DOB: " + stu.getDOB());
        System.out.println("Age: " + stu.getAge());
    }

    public static String getModuleNames(ArrayList<Module> modules) {
        String listofmodules = "";

        for (Module module : modules) {
            listofmodules = "" + listofmodules + module.getModuleName() + " ";
        }

        return listofmodules;
    }

}
