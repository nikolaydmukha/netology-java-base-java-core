package home.netology.javacore.multithreadingprogramming.synchronization.task1;

public class Producer implements Runnable {

    private AutoDealer dealer;

    public Producer(AutoDealer dealer) {
        this.dealer = dealer;
    }

    @Override
    public void run() {
        for (int i = 1; i < 10; i++) {
            Car car = new Car("Mercedes-Benz".concat(String.valueOf(i)));
            dealer.receiveCar(car);
        }
    }
}
