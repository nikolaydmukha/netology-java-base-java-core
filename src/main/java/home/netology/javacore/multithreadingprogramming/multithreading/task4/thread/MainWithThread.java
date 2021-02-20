package home.netology.javacore.multithreadingprogramming.multithreading.task4.thread;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MainWithThread {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();

        Date date = new Date();
        for (int i = 0; i < 100_000_000; i++) {
            numbers.add(date.getSeconds() * i);
        }

        List<Integer> arr1 = arrayCopy(numbers, 0);
        List<Integer> arr2 = arrayCopy(numbers, numbers.size() / 2);

        Long start1 = date.getTime();
        MyThread thread1 = new MyThread(arr1, start1);
        thread1.setName("Поток 1");
        System.out.println("Запустили " + thread1.getName() + " " + start1);
        thread1.start();

        Long start2 = date.getTime();
        MyThread thread2 = new MyThread(arr2, start2);
        thread2.setName("Поток 2");
        System.out.println("Запустили " + thread2.getName() + " " + start2);
        thread2.start();

    }

    private static List<Integer> arrayCopy(List<Integer> src, int startPosition) {
        List<Integer> dst = new ArrayList<>();
        int endPosition;
        if (startPosition == 0) {
            endPosition = src.size() / 2;
        } else {
            endPosition = src.size();
        }
        for (int i = startPosition; i < endPosition; i++) {
            dst.add(src.get(i));
        }
        System.out.println(dst.get(0));
        return dst;
    }
}
