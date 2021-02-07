package home.netology.javacore.multithreadingprogramming.synchronization.task1;

public class Buyer implements Runnable {

    private AutoDealer dealer;


    public Buyer(AutoDealer dealer) {
        this.dealer = dealer;
    }

    @Override
    public void run() {
        System.out.println("Пришёл покупатель " + Thread.currentThread().getName());
        dealer.sellCar();
    }

}
