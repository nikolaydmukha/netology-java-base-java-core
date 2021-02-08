package home.netology.javacore.multithreadingprogramming.synchronization.task1;

import java.util.ArrayList;
import java.util.List;

public class AutoDealer {

    private static List<Car> totalCar = new ArrayList<>();
    private int totalCarsNumber = 0;
    final int TIME_TO_MAKE_NEW_CAR = 1500;
    final int TIME_TO_CHECK_NEW_CAR = 1000;
    final int TIME_TO_SELL_NEW_CAR = 500;

    public synchronized void receiveCar(Car car) {
        while (totalCarsNumber != 0) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Ждем сборки очередного авто завода " + Thread.currentThread().getName());
        try {
            Thread.sleep(TIME_TO_MAKE_NEW_CAR);
        } catch (InterruptedException ex) {
            System.out.println(ex.getMessage());
        }
        System.out.println("Принимаем новую машину...");
        System.out.println("Приняли машину " + car.getName());
        totalCar.add(car);
        totalCarsNumber++;
        notify();
    }

    public synchronized void sellCar() {
        while (totalCarsNumber == 0) {
            try {
                System.out.println("Нет машин в наличии.");
                try {
                    Thread.sleep(TIME_TO_CHECK_NEW_CAR);
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
            Thread.sleep(TIME_TO_SELL_NEW_CAR);
        } catch (InterruptedException ex) {
            System.out.println(ex.getMessage());
        }
        System.out.println("Покупатель " + Thread.currentThread().getName() + " уехал на новеньком " + totalCar.get(totalCar.size() - 1).getName());
        totalCar.remove(totalCar.size() - 1);
        totalCarsNumber--;
        notify();
    }
}
