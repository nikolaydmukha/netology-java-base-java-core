package home.netology.javacore.multithreadingprogramming.concurrentcollections.task2;

import java.util.Map;

public class SynchronizedMapReader extends Thread{
    private Map<String, String> map;

    public SynchronizedMapReader(Map<String, String> map) {
        this.map = map;
    }

    @Override
    public void run() {
        for (int i = 1; i < map.size(); i++) {
            System.out.println(Thread.currentThread().getName() + " " + map.get("key".concat(String.valueOf(i))));
        }

    }
}
