package home.netology.javacore.multithreadingprogramming.synchronization.task3;

public class Waiter implements Runnable{

    private Cafe cafe;

    public Waiter(Cafe cafe) {
        this.cafe = cafe;
    }

    @Override
    public void run() {
        System.out.println("Официант " + Thread.currentThread().getName() + " заступил на дежурство.");
        try {
            cafe.getOrder();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
