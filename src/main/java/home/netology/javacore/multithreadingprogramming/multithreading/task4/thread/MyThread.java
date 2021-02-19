package home.netology.javacore.multithreadingprogramming.multithreading.task4.thread;

import java.util.Date;
import java.util.List;

public class MyThread extends Thread {
    private List<Integer> arr;
    private Long start;

    public MyThread(List<Integer> arr, Long start) {
        this.arr = arr;
        this.start = start;
    }

    @Override
    public void run() {
        Date date = new Date();

        Integer max = arr.get(0);
        for (int i = 0; i < arr.size(); i++) {
            if(arr.get(i) > max){
                max = arr.get(i);
            }
        }
        Long finish = date.getTime();
        System.out.println(Thread.currentThread().getName() + " завершил работу");
        System.out.println("Затрачено: " + (finish - start));
        System.out.println(max);
    }
}
