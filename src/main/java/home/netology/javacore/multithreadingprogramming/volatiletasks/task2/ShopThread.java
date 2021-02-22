package home.netology.javacore.multithreadingprogramming.volatiletasks.task2;

import home.netology.javacore.multithreadingprogramming.volatiletasks.task2.utils.DoubleOutputUtil;

import java.text.DecimalFormat;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.DoubleAdder;

public class ShopThread implements Runnable {
    private List<Double> sales;
    private Double income;
    private String name;

    public ShopThread(List<Double> sales, String name) {
        this.sales = sales;
        this.name = name;
    }

    @Override
    public void run() {
        ExecutorService executorService = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());
        DoubleAdder stat = new DoubleAdder();
        sales.stream()
                .forEach(i -> executorService.submit(() -> stat.add(i)));

        try {
            executorService.awaitTermination(3, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        income = stat.sum();
        System.out.println("Доход " + name + ": " + DoubleOutputUtil.doubleFormatter(income));
        executorService.shutdown();
    }

    public double getIncome() {
        return income.doubleValue();
    }
}
