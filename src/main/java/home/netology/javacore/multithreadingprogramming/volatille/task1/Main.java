package home.netology.javacore.multithreadingprogramming.volatille.task1;

public class Main {
    public static void main(String[] args) {
        Switcher switcher = new Switcher();

        Thread user = new Thread(new User(switcher));
        Thread turnOffAutomate = new Thread(new TurnOffAutomate(switcher));

        user.setName("Поток пользователя");
        turnOffAutomate.setName("Поток автомата-выключателя");

    }
}
