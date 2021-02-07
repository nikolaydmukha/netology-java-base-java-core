package home.netology.javacore.multithreadingprogramming.synchronization.task1;

public class Producer implements Runnable {

    private AutoDealer dealer;

    public Producer(AutoDealer dealer) {
        this.dealer = dealer;
    }

    @Override
    public void run() {
        Car car = new Car("Mercedes-Benz");
        for (int i = 1; i < 10; i++) {
            car.setName(String.valueOf(i));
            dealer.receiveCar(car);
        }
    }
}
