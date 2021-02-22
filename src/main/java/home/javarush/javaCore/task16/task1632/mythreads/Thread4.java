package home.javarush.javaCore.task16.task1632.mythreads;

import home.javarush.javaCore.task16.task1632.Message;

public class Thread4 extends Thread implements Message {

    @Override
    public void showWarning() {
        this.interrupt();
    }

    @Override
    public void run() {
        while (!isInterrupted()) {
        }
    }
}
