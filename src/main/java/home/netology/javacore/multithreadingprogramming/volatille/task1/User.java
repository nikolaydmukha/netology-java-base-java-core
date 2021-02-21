package home.netology.javacore.multithreadingprogramming.volatille.task1;

public class User implements  Runnable{

    private Switcher switcher;

    public User(Switcher switcher) {
        this.switcher = switcher;
    }

    @Override
    public void run() {

    }
}
