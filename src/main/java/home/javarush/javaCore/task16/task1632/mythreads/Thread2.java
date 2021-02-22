package home.javarush.javaCore.task16.task1632.mythreads;

public class Thread2 extends Thread {

    @Override
    public void run() {
        while (true) {
            if (isInterrupted()) {
                System.out.println("InterruptedException");
            }
        }
    }
}
