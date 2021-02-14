package home.javarush.javaCore.task16.task1618;

/*
Снова interrupt
*/

public class Solution {
    public static void main(String[] args) throws InterruptedException {
        //Add your code here - добавь код тут
        TestThread testThread = new TestThread();
        testThread.start();
        Thread.sleep(1000);
        testThread.interrupt();
        System.out.println("Interrupted");
    }

    //Add your code below - добавь код ниже
    public static class TestThread extends Thread {
        @Override
        public void run() {
            Thread current = Thread.currentThread();
            int i = 0;
            while (!current.isInterrupted()) {
                System.out.println(Thread.currentThread().getName() + " loop " + i);
                i++;
            }
        }
    }
}