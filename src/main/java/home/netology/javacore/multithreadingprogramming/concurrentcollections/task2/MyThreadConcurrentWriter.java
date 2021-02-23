package home.netology.javacore.multithreadingprogramming.concurrentcollections.task2;

import java.util.concurrent.ConcurrentHashMap;

public class MyThreadConcurrentWriter  extends Thread{
    private ConcurrentHashMap<String, String> map;

    public MyThreadConcurrentWriter(ConcurrentHashMap<String, String> map) {
        this.map = map;
    }

    @Override
    public void run() {
        for (int i = 1; i < map.size(); i++){
            map.put("key".concat(String.valueOf(i)), Thread.currentThread().getName().concat(" 0000"));
        }

    }
}
