package home.netology.javacore.multithreadingprogramming.multithreading.task3;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ForkJoinPool;

public class Main {
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>();

        for (int i = 0; i < 1000; i++) {
            arr.add((int) ( Math.random() * 100 ));
        }

        monoTask(arr);
        multiTask(arr);

    }

    private static void monoTask(List<Integer> arr){
        //Mono sum counter
        long start = System.currentTimeMillis();
        int sum = 0;
        for (Integer number : arr) {
            sum += number;
        }
        long stop = System.currentTimeMillis();
        System.out.println("Сумма: " + sum + " Время выполнения моно задачи: " + (stop - start));

    }

    private static void multiTask(List<Integer> arr){
        ForkJoinPool fjp = new ForkJoinPool();
        SumCounter cst = new SumCounter(arr);
        long start = System.currentTimeMillis();
        fjp.invoke(cst);
        long stop = System.currentTimeMillis();
        System.out.println("Сумма: " + cst.getSum() + " Время выполнения мульти задачи: " + (stop - start));
    }
}
