package home.netology.javacore.multithreadingprogramming.concurrentcollections.task1;

import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

public class ConcurrentQueueExample {
    public static volatile boolean cycle = true;

    ConcurrentQueueExample(Queue<String> queue) {
        queue = new ConcurrentLinkedQueue<>();

        Thread ats = new Thread(new TelephonyStation(queue));
        Thread agent1 = new Thread(new Agent(queue));
        Thread agent2 = new Thread(new Agent(queue));
        Thread agent3 = new Thread(new Agent(queue));
        ats.start();
        agent1.start();
        agent2.start();
        agent3.start();

        while (agent1.isAlive()) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.exit(0);
    }

}
