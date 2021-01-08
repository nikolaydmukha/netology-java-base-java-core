package main.java.home.javarush.task12.task1221;

import java.util.ArrayList;

public class Solution<T> {

    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("Акакий"));
        students.add(new Student("Любослав"));
//        students.add("Анатолий");
//        students.add(new Thread());
//        students.add(new Student[]{new Student("Афанасий"), new Student("Платон")});
        
        printStudentNames(students);

    }

    public static void printStudentNames(ArrayList<Student> students) {
        students.forEach(student -> {
            System.out.println(((Student) student).getName());
        });
    }

}
