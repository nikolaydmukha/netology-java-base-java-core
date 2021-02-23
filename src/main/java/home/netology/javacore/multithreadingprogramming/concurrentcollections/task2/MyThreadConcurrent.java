package home.netology.javacore.multithreadingprogramming.concurrentcollections.task2;

import java.util.concurrent.ConcurrentHashMap;

public class MyThreadConcurrent extends Thread{
    private ConcurrentHashMap<String, String> map;

    public MyThreadConcurrent(ConcurrentHashMap<String, String> map) {
        this.map = map;
    }

    @Override
    public void run() {
        for (int i = 1; i < map.size(); i++){
            System.out.println(Thread.currentThread().getName() + " " + map.get("key".concat(String.valueOf(i))));
            map.put("key".concat(String.valueOf(i)), "value".concat(Thread.currentThread().getName()));
        }
    }
}
