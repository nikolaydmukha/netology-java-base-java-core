package home.netology.javacore.multithreadingprogramming.synchronization.task2;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.locks.ReentrantLock;

public class AutoDealer {

    private ReentrantLock locker;

    public AutoDealer(ReentrantLock locker) {
        this.locker = locker;
    }

    private static List<Car> totalCar = new ArrayList<>();
    private int totalCarsNumber = 0;
    final int TIME_TO_MAKE_NEW_CAR = 1500;
    final int TIME_TO_CHECK_NEW_CAR = 1000;
    final int TIME_TO_SELL_NEW_CAR = 500;

    public void receiveCar(Car car) {
        locker.lock();
        try {
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
        }finally {
            locker.unlock();
        }
    }

    public void sellCar() {
        locker.lock();
        try {
            while (totalCarsNumber == 0) {
                System.out.println("Нет машин в наличии.");
                try {
                    Thread.sleep(TIME_TO_CHECK_NEW_CAR);
                } catch (InterruptedException ex) {
                    System.out.println(ex.getMessage());
                }
            }
            System.out.println("Продаём новую машину " + totalCar.get(totalCar.size() - 1).getName());
            try {
                Thread.sleep(TIME_TO_SELL_NEW_CAR);
            } catch (InterruptedException ex) {
                System.out.println(ex.getMessage());
            }
            System.out.println("Покупатель " + Thread.currentThread().getName() + " уехал на новеньком " + totalCar.get(0).getName());
            totalCar.remove(0);
            totalCarsNumber--;
        }finally {
            locker.unlock();
        }
    }
}
