package home.netology.javacore.multithreadingprogramming.concurrentcollections.task2;

import java.util.Map;

public class SynchronizedMapWriter extends Thread{
    private Map<String, String> map;

    public SynchronizedMapWriter(Map<String, String> map) {
        this.map = map;
    }

    @Override
    public void run() {
        for (int i = 1; i < map.size(); i++) {
            map.put("key".concat(String.valueOf(i)), Thread.currentThread().getName()).concat(" 2222");
        }
    }
}
