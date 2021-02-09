package home.netology.javacore.multithreadingprogramming.synchronization.task3;

public class Cafe {
    public static int totalVisitors = 0;
    private static int totalReadyToMakeOrder = 0;
    private static int totalMadeOrder = 0;

    //Customer
    public synchronized void makeOrder() throws InterruptedException {
        System.out.println(Thread.currentThread().getName() + " читает меню и выбирает блюдо.");
        Thread.sleep(2000);
        System.out.println(Thread.currentThread().getName() + " готов сделать заказ.");
        totalReadyToMakeOrder++;
        notify();
    }

    //Cafe
    public synchronized void getOrder() throws InterruptedException {
        while (totalReadyToMakeOrder == 0) {
            wait();
        }
        System.out.println(Thread.currentThread().getName() + " идёт принимать заказ у посетителя.");
        Thread.sleep(1000);
        System.out.println(Thread.currentThread().getName() + " принял заказ у посетителя.");
        totalMadeOrder++;
        notify();
    }

    public synchronized void prepareOrder() throws InterruptedException {
        while (totalMadeOrder == 0){
            wait();
        }

    }

    public void giveOrderToCustomer() {

    }
}
