package home.netology.javacore.multithreadingprogramming.synchronization.task1;

import java.util.ArrayList;
import java.util.List;

public class Producer implements Runnable {

    private AutoDealer dealer;

    public Producer(AutoDealer dealer) {
        this.dealer = dealer;
    }

    @Override
    public void run() {
        System.out.println("Машины привёз поставщик " + Thread.currentThread().getName());
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("Mercedes-Benz"));
        cars.add(new Car("BMW"));
        cars.add(new Car("Volvo"));
        cars.add(new Car("Lexus"));

        dealer.receiveCar(cars);
    }
}
