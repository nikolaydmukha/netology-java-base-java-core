package home.netology.javacore.multithreadingprogramming.concurrentcollections.task1;

import java.util.Queue;

class TelephonyStation implements Runnable {
    private Queue<String> queue;

    public TelephonyStation(Queue<String> queue) {
        this.queue = queue;
    }

    public void run() {
        System.out.println("ATS started");
        try {
            for (int i = 1; i <= 60; i++) {
                String str = "Call" + i;
                queue.add(str);
                System.out.println("ATS added : " + str);
                Thread.sleep(100);
            }
            ConcurrentQueueExample.cycle = false;
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}

