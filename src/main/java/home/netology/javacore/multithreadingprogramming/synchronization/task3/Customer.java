package home.netology.javacore.multithreadingprogramming.synchronization.task3;

public class Customer implements Runnable{
    private Cafe cafe;

    public Customer(Cafe cafe) {
        this.cafe = cafe;
    }

    @Override
    public void run() {
        System.out.println("Посетитель " + Thread.currentThread().getName() + " пришёл в кафе.");
    }
}
