package home.netology.javacore.multithreadingprogramming.concurrentcollections.task2;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class Main {

    public static Map<String, String> synchronizedMap = Collections.synchronizedMap(new HashMap<>());
    public static ConcurrentHashMap<String, String> concurrentMap = new ConcurrentHashMap<>();

    public static void main(String[] args) {


        for(int i = 0; i < 50; i++){
            synchronizedMap.put("key".concat(String.valueOf(i)), "value".concat(String.valueOf(i)));
            concurrentMap.put("key".concat(String.valueOf(i)), "value".concat(String.valueOf(i)));
        }

        MyThreadConcurrent myThreadConcurrent1 = new MyThreadConcurrent(concurrentMap);
        MyThreadConcurrent myThreadConcurrent2 = new MyThreadConcurrent(concurrentMap);
        MyThreadConcurrent myThreadConcurrent3 = new MyThreadConcurrent(concurrentMap);

        SynchronizedMap synchronizedMap1 = new SynchronizedMap(synchronizedMap);
        SynchronizedMap synchronizedMap2 = new SynchronizedMap(synchronizedMap);
        SynchronizedMap synchronizedMap3 = new SynchronizedMap(synchronizedMap);

        myThreadConcurrent1.start();
        myThreadConcurrent2.start();
        myThreadConcurrent3.start();

        synchronizedMap1.start();
        synchronizedMap2.start();
        synchronizedMap3.start();
    }
}
