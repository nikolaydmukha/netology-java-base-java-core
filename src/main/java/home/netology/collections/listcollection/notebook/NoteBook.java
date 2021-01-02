package main.java.home.netology.collections.listcollection.notebook;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class NoteBook {

    static ArrayList<String> taskList = new ArrayList<>();

    public static void getTask(Scanner scanner, ArrayList<String> taskList) {
        scanner.nextLine();
        System.out.println("Введите задачу:");
        String task = scanner.nextLine();
        taskList.add(task);
        System.out.println("Задача добавлена.");
    }

    public static void printTasks() {
        if (taskList.size() != 0) {
            System.out.println("Список задач: ");
            int i = 1;
            for (String task : taskList) {
                System.out.println(i + ". " + task);
                i++;
            }
        } else {
            System.out.println("В списке задач пусто.");
        }
    }

    public static void deleteTask(Scanner scanner) {
        scanner.nextLine();
        printTasks();
        System.out.println("Выберите задачу для удаления:");
        int taskNumber = -1;
        while (taskNumber <= 0) {
            try {
                int number = scanner.nextInt();
                if (number > taskList.size() || number <= 0) {
                    throw new IndexOutOfBoundsException();
                }
                deleteTask(taskList, number - 1);
                taskNumber = 1;
            } catch (InputMismatchException | IllegalStateException | IndexOutOfBoundsException ex) {
                scanner.nextLine();
                System.out.println("Выберите задачу от 1 до " + taskList.size());
            }
        }
    }

    public static void deleteTask(ArrayList<String> taskList, int number) {
        taskList.remove(number);
    }
}
