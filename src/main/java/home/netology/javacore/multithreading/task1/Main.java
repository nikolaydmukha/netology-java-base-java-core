package home.netology.javacore.multithreading.task1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        MyThread myThread1 = new MyThread("Поток 1");
        MyThread myThread2 = new MyThread("Поток 2");
        MyThread myThread3 = new MyThread("Поток 3");
        MyThread myThread4 = new MyThread("Поток 4");
        System.out.println("Создаем потоки");
        ThreadGroup tg = new ThreadGroup("Group 1");

        Thread thread1 = new Thread(tg, myThread1);
        Thread thread2 = new Thread(tg, myThread2);
        Thread thread3 = new Thread(tg, myThread3);
        Thread thread4 = new Thread(tg, myThread4);

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();

        try {
            Thread.sleep(10000);
            System.out.println("Завершаем потоки");
            tg.interrupt();
        }catch (InterruptedException ex){
            System.out.println(ex.getMessage());
        }

    }
}
