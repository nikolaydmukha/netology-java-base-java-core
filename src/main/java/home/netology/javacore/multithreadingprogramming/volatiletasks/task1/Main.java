package home.netology.javacore.multithreadingprogramming.volatiletasks.task1;

import home.netology.javacore.multithreadingprogramming.volatiletasks.task1.utils.DateUtil;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Switcher switcher = new Switcher();

        Thread user = new Thread(new User(switcher));
        Thread turnOffAutomate = new Thread(new TurnOffAutomate(switcher));

        user.setName(" Поток пользователя");
        turnOffAutomate.setName(" Поток автомата-выключателя");
        user.start();
        turnOffAutomate.start();
        user.join();
        turnOffAutomate.interrupt();
        System.out.println(DateUtil.printCurrentTime() + turnOffAutomate.getName() + " остановлен");
    }
}
