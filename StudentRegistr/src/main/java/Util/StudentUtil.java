/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Util;

import Beans.Student;
import studentregistrSystem.Config;

/**
 *
 * @author elcan
 */
public class StudentUtil {

    public static Student fillStudent() {
        String name = InputUtil.requireText("Enter Name");
        String surname = InputUtil.requireText("Enter Surname");
        int age = InputUtil.requireNumber("Enter Age");
        String className = InputUtil.requireText("Enter Class");

        Student st = new Student(name, surname, age, className);
        return st;

    }

    public static void printAllStudentsRegistr() {
        if (Config.students == null) {
            return;
        }//nullPointer Exeption
        for (int i = 0; i < Config.students.length; i++) {
            Student st = Config.students[i];
            System.out.println(+(i + 1) + ":" + st.getfullinfo());
        }

    }

    public static void registerStudents() {
        int count = InputUtil.requireNumber("How many students you will registr?");
        Config.students = new Student[count];

        for (int i = 0; i < count; i++) {
            System.out.println(+(i + 1) + ".Registr:");

            Student st = StudentUtil.fillStudent();
            Config.students[i] = st;
        }
        System.out.println("Registration succesfully ended");
        StudentUtil.printAllStudentsRegistr();
    }

    public static void findSudentsAndPrint() {
        String text = InputUtil.requireText("Enter Name , Surname , or Class name");
        Student[] result = findStudent(text);
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i].getfullinfo());
        }

    }

    public static Student[] findStudent(String text) {
        int count = 0;
        for (int i = 0; i < Config.students.length; i++) {
            Student st = Config.students[i];
            if (st.getName().contains(text) || st.getSurname().contains(text) || st.getClassName().contains(text)) {
                count++;
            }
        }
        int found = 0;
        Student[] result = new Student[count];
        for (int i = 0; i < Config.students.length; i++) {
            Student st = Config.students[i];
            if (st.getName().contains(text) || st.getSurname().contains(text) || st.getClassName().contains(text)) {
                result[found++] = st;
            }

        }

        return result;

    }

    public static void uptadeStudent1() {//uptadeing students with making new objective (referance)
        StudentUtil.printAllStudentsRegistr();
        int i = InputUtil.requireNumber("Which Student you want to uptade ? Input Index of student pls");
        Student s = StudentUtil.fillStudent();
        Config.students[i - 1] = s;

    }

    public static void uptadeStudent2() {//uptadeing without making new objective
        StudentUtil.printAllStudentsRegistr();
        int i = InputUtil.requireNumber("Which Student you want to uptade ? Input Index of student pls");
        Student Selected = Config.students[i - 1];
        Selected.setName(InputUtil.requireText("Name"));
        Selected.setSurname(InputUtil.requireText("Surname"));
        Selected.setAge(InputUtil.requireNumber("Age"));
        Selected.setClassName(InputUtil.requireText("Class"));

    }

    public static void uptadeStudent3() {
        StudentUtil.printAllStudentsRegistr();
        int index = InputUtil.requireNumber("Which Student you want to uptade ? Input Index of student pls");
        Student Selected = Config.students[index - 1];
        String Changeparametres = InputUtil.requireText("What you want to change ?(ex: name, surname, age ,className)");
        String[] parametres = Changeparametres.split(",");
        for (int i = 0; i < parametres.length; i++) {
            String param = parametres[i];
            if (param.equalsIgnoreCase("name")) {
                Selected.setName(InputUtil.requireText("Name"));
            }else
            if (param.equalsIgnoreCase("surname")) {
                Selected.setSurname(InputUtil.requireText("Surname"));
            }else
            if (param.equalsIgnoreCase("Age")) {
                Selected.setAge(InputUtil.requireNumber("Age"));
            }else
            if (param.equalsIgnoreCase("Classname")) {
                Selected.setClassName(InputUtil.requireText("Class"));
            }
        }

    }
}
