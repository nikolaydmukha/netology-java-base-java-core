package main.java.home.netology.javabase.collections.hashmap.students;

import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        HashSet<Student> students = new HashSet<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Введите студента в формате: ФИО, номер группу, номер студенческого или 'стоп' для  окончания: ");
            String input = scanner.nextLine();
            if (input.equals("стоп")) {
                printStudent(students);
                break;
            }
            String[] studentData = input.split(",");
            Student student = makeStudent(studentData);
            if (!isExist(students, student)) {
                students.add(student);
            } else {
                System.out.println("Студент с номером студенческого " + student.getAccountId() + " уже существует.");
                continue;
            }

        }
    }

    private static Student makeStudent(String[] studentData) {
        return new Student(studentData[0], studentData[1], studentData[2]);
    }

    private static boolean isExist(HashSet<Student> students, Student newStudent) {
        for (Student student : students) {
            if (student.equals(newStudent)) {
                return true;
            }
        }
        return false;
    }

    private static void printStudent(HashSet<Student> students){
        System.out.println("Список студентов: ");
        for(Student student : students){
            student.toString();
        }
    }
}
