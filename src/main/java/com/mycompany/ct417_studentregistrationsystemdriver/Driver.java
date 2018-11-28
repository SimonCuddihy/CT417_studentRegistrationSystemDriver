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

    static ArrayList<Student> EEEStudents = new ArrayList<Student>();
    static ArrayList<Student> ECEStudents = new ArrayList<Student>();
    static ArrayList<Student> ITStudents = new ArrayList<Student>();
    static ArrayList<Student> Students = new ArrayList<Student>();
    static ArrayList<Module> EEEModules = new ArrayList<Module>();
    static ArrayList<Module> ECEModules = new ArrayList<Module>();
    static ArrayList<Module> ITModules = new ArrayList<Module>();
    
    public static void main(String[] args) {
        // TODO Auto-generated method stub

       
        Student studentsample = new Student("Simon Cuddihy", 24, new DateTime(1993, 11, 10, 0, 0, 0));
        Student studentsample1 = new Student("Mark Twain", 23, new DateTime(1993, 12, 12, 0, 0, 0));
        Student studentsample2 = new Student("John Sample", 22, new DateTime(1994, 12, 12, 0, 0, 0));
        ECEStudents.add(studentsample);
        EEEStudents.add(studentsample1);
        ITStudents.add(studentsample2);
       
        
        Students.addAll(ECEStudents);
        Students.addAll(EEEStudents);
        Students.addAll(ITStudents);
        
        Module SE = new Module("Software Engineering");
        Module ML = new Module("Machine Learning & Data Mining");
        Module SoC = new Module("System on Chip");
        Module DSP = new Module("Digital Signal Processing");
        Module PE = new Module("Power Electronics");
        Module PS = new Module("Power Systems");
        Module AI = new Module("Artificial Intelligence");
        Module CRY = new Module("Cryptography");

        ECEModules.add(SE);
        ECEModules.add(ML);
        ECEModules.add(DSP);
        ECEModules.add(SoC);
        EEEModules.add(DSP);
        EEEModules.add(SoC);
        EEEModules.add(PS);
        EEEModules.add(PE);
        ITModules.add(CRY);
        ITModules.add(ML);
        ITModules.add(AI);
        ITModules.add(SE);

        DateTime startDate = new DateTime(2014, 9, 01, 0, 0, 0);
        DateTime endDate = new DateTime(2018, 8, 30, 0, 0, 0);

        Course ECE = new Course("Electronic & Computer Engineering", "BP", startDate, endDate);
        ECE.setModules(ECEModules);
        
        Course EEE = new Course("Electronic & Electrical Engineering", "BE", startDate, endDate);
        EEE.setModules(EEEModules);
        
        Course IT = new Course("Information Technology", "IT", startDate, endDate);
        IT.setModules(ITModules);
        
        for(Student s : ECEStudents) ECE.registerStudent(s);
        for(Student s : EEEStudents) EEE.registerStudent(s);
        for(Student s : ITStudents) IT.registerStudent(s);

        for(Student s : Students) {
            System.out.println(
                    "Student Details:\n----------------\n" + s +
                    "\nCourse Details: " + s.getCourse() +
                    "\nModules: " + s.getModules() + "\n"
            );
        }
        
//        createCourse(EEEStudents, EEEModules, EEE);
//        createCourse(ECEStudents, ECEModules, ECE);
//        createCourse(ITStudents, ITModules, IT);
//
//        printoutCourseProgrammeStudents(ECEStudents);
//        printoutCourseProgrammeStudents(EEEStudents);
//        printoutCourseProgrammeStudents(ITStudents);
//    }
//
//    public static void createCourse(ArrayList<Student> students, ArrayList<Module> modules, Course course) {
//        for (Module module : modules) {
//            module.addStudents(students);
//        }
//        for(Student student : students) {
//            student.addStudentocourse(course);
//        }
//    }
//
//    public static void printoutCourseProgrammeStudents(ArrayList<Student> stu) {
//        for(Student student : stu) {
//
//            printStudent(student);
//            Course course = student.getCourse();
//            System.out.println("Course Programme: " + course.getCourseName());
//            System.out.println("Modules:" + getModuleNames(course.getModules()));
//            System.out.println();
//        }
//    }
//
//    public static void printStudent(Student stu) {
//
//        System.out.println("Name: " + stu.getName());
//        System.out.println("Username: " + stu.getUsername());
//        System.out.println("ID: " + stu.getID());
//        System.out.println("DOB: " + stu.getDOB());
//        System.out.println("Age: " + stu.getAge());
//    }
//
//    public static String getModuleNames(ArrayList<Module> modules) {
//        String listofmodules = "";
//
//        for (Module module : modules) {
//            listofmodules = "" + listofmodules + module.getModuleName() + ", ";
//        }
//
//        return listofmodules;
//    }

    }}
