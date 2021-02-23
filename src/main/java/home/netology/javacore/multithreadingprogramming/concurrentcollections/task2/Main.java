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

        MyThreadConcurrentReader myThreadConcurrentReader1 = new MyThreadConcurrentReader(concurrentMap);
        MyThreadConcurrentWriter myThreadConcurrentWriter1 = new MyThreadConcurrentWriter(concurrentMap);
        MyThreadConcurrentReader myThreadConcurrentReader2 = new MyThreadConcurrentReader(concurrentMap);
        MyThreadConcurrentReader myThreadConcurrentReader3 = new MyThreadConcurrentReader(concurrentMap);

        SynchronizedMapReader synchronizedMapReader1 = new SynchronizedMapReader(synchronizedMap);
        SynchronizedMapWriter synchronizedMapWriter1 = new SynchronizedMapWriter(synchronizedMap);
        SynchronizedMapReader synchronizedMapReader2 = new SynchronizedMapReader(synchronizedMap);
        SynchronizedMapReader synchronizedMapReader3 = new SynchronizedMapReader(synchronizedMap);

        myThreadConcurrentReader1.start();
        myThreadConcurrentWriter1.start();
        myThreadConcurrentReader2.start();
        myThreadConcurrentReader3.start();


//        synchronizedMapReader1.start();
//        synchronizedMapWriter1.start();
//        synchronizedMapReader2.start();
//        synchronizedMapReader3.start();

    }
}
