package home.netology.javacore.multithreadingprogramming.volatiletasks.task1;

import home.netology.javacore.multithreadingprogramming.volatiletasks.task1.utils.DateUtil;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Formatter;

public class TurnOffAutomate extends Thread {

    private static int SLEEP_TIME = 1000;
    private Switcher switcher;

    public TurnOffAutomate(Switcher switcher) {
        this.switcher = switcher;
    }

    @Override
    public void run() {

        while (!isInterrupted()) {
            if (switcher.getButtonStatus().equals("On")) {
                try {
                    Thread.sleep(SLEEP_TIME);
                    System.out.println(DateUtil.printCurrentTime() + Thread.currentThread().getName() + " перевёл тумблер в положение Off.");
                } catch (InterruptedException iex) {
                    System.out.println(DateUtil.printCurrentTime() + Thread.currentThread().getName() + " прерван.");
                    break;
                }
            }
        }

    }
}
