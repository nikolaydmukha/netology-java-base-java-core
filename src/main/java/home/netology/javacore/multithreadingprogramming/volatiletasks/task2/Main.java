package home.netology.javacore.multithreadingprogramming.volatiletasks.task2;

import home.netology.javacore.multithreadingprogramming.volatiletasks.task2.utils.DoubleOutputUtil;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        List<Double> shop1 = new ArrayList<>();
        List<Double> shop2 = new ArrayList<>();
        List<Double> shop3 = new ArrayList<>();

        int max = 20_000;
        for (int i = 0; i < 10; i++) {
            shop1.add(Math.random() * max * (i + 1));
            shop2.add(Math.random() * max * (i + 1));
            shop3.add(Math.random() * max * (i + 1));
        }
        ShopThread shopThread1 = new ShopThread(shop1, "Магазин 1");
        ShopThread shopThread2 = new ShopThread(shop2, "Магазин 2");
        ShopThread shopThread3 = new ShopThread(shop3, "Магазин 3");

        shopThread1.run();
        shopThread2.run();
        shopThread3.run();
        System.out.println("Итого в налоговую поступило: " +
                DoubleOutputUtil.doubleFormatter((shopThread1.getIncome() + shopThread2.getIncome() + shopThread3.getIncome())));
    }
}
