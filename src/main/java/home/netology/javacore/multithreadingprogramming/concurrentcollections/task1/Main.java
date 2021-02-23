package home.netology.javacore.multithreadingprogramming.concurrentcollections.task1;

import java.util.Queue;

public class Main {

    public static void main(String[] args) {
        Queue<String> queue = null;

        new ConcurrentQueueExample(queue);
    }
}
