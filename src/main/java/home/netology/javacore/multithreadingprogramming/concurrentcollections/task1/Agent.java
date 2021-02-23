package home.netology.javacore.multithreadingprogramming.concurrentcollections.task1;

import java.util.Queue;

class Agent implements Runnable {

    private Queue<String> queue;

    public Agent(Queue<String> queue) {
        this.queue = queue;
    }

    public void run() {
        String str;
        System.out.println("Agent " + Thread.currentThread().getName() + " started\n");
        while (ConcurrentQueueExample.cycle || queue.size() > 0) {
            if ((str = queue.poll()) != null)
                System.out.println(Thread.currentThread().getName() + " removed : " + str);
            try {
                Thread.sleep(3000);
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
    }
}
