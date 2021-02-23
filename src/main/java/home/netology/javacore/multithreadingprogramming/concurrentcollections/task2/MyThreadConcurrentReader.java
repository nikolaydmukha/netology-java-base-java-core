package home.netology.javacore.multithreadingprogramming.concurrentcollections.task2;

import java.util.concurrent.ConcurrentHashMap;

public class MyThreadConcurrentReader extends Thread{
    private ConcurrentHashMap<String, String> map;

    public MyThreadConcurrentReader(ConcurrentHashMap<String, String> map) {
        this.map = map;
    }

    @Override
    public void run() {
        for (int i = 1; i < map.size(); i++){
            System.out.println(Thread.currentThread().getName() + " " + map.get("key".concat(String.valueOf(i))));
        }

    }
}
