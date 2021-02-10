package home.netology.javacore.multithreadingprogramming.synchronization.task3;

public class Cafe {
    final static int TIME_TO_READ_MENU = 2000;
    final static int TIME_TO_GET_ORDER = 2000;

    public static int totalVisitors = 0;
    private static int totalReadyToMakeOrder = 0;
    private static int totalMadeOrder = 0;

    private Chief chief = new Chief("Шеф");

    //Customer
    public synchronized void makeOrder() throws InterruptedException {
        System.out.println(Thread.currentThread().getName() + " читает меню и выбирает блюдо.");
        Thread.sleep(TIME_TO_READ_MENU);
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
        Thread.sleep(TIME_TO_GET_ORDER);
        System.out.println(Thread.currentThread().getName() + " принял заказ у посетителя.");
        totalMadeOrder++;
        notify();
        prepareOrder();
    }

    public void prepareOrder() throws InterruptedException {
        synchronized (chief) {
            while (totalMadeOrder == 0) {
                wait();
            }
            System.out.println("Повар приготовил заказ");
            notify();
            giveOrderToWaiter();
        }
    }

    public void giveOrderToWaiter() throws InterruptedException {
        synchronized (chief){
            while (totalMadeOrder == 0){
                wait();
            }
        }
        System.out.println(Thread.currentThread().getName() + " несёт заказ посетителю");
        giveOrderToCustomer();
    }

    public void giveOrderToCustomer() {
        System.out.println(Thread.currentThread().getName() + " отдал заказ посетителю");
    }
}
