package home.netology.javacore.multithreadingprogramming.synchronization.task1;

import java.util.ArrayList;
import java.util.List;

public class AutoDealer {
    private static List<Car> totalCar = new ArrayList<>();

    public synchronized void receiveCar(List<Car> cars) {
        while (totalCar.size() != 0) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Принимаем новую машину...");
        for (Car car : cars) {
            System.out.println("Приняли машину " + car.getName());
            totalCar.add(car);
        }
        notify();
    }

    public synchronized void sellCar() {
        while (totalCar.size() == 0) {
            try {
                System.out.println("Нет машин в наличии. Ждём поставку");
                try {
                    Thread.sleep(5);
                } catch (InterruptedException ex) {
                    System.out.println(ex.getMessage());
                }
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Продаём новую машину " + totalCar.get(totalCar.size() - 1).getName());
        try {
            Thread.sleep(8);
        } catch (InterruptedException ex) {
            System.out.println(ex.getMessage());
        }
        System.out.println("Продали машину " + totalCar.get(totalCar.size() - 1).getName() + " покупателю " + Thread.currentThread().getName());

        totalCar.remove(totalCar.size() - 1);
    }
}
