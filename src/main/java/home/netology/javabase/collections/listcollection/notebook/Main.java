package main.java.home.netology.javabase.collections.listcollection.notebook;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    static Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) {
        int action = -1;


        while (action != 0) {
            System.out.println("Выберите действие:\n" +
                    "1. Добавить задачу\n" +
                    "2. Вывести список задач\n" +
                    "3. Удалить задачу\n" +
                    "0. Выход");
            try {
                action = scanner.nextInt();
                switch (action) {
                    case 1:
                        NoteBook.getTask(scanner, NoteBook.taskList);
                        break;
                    case 2:
                        NoteBook.printTasks();
                        break;
                    case 3:
                        NoteBook.deleteTask(scanner);
                        break;
                }
            } catch (InputMismatchException | IllegalStateException ex) {
                scanner.nextLine();
                System.out.println("Выберите пункт меню ещё раз.");
            }


        }
    }
}
