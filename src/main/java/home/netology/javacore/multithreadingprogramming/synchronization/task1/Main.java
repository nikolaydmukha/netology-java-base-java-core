package home.netology.javacore.multithreadingprogramming.synchronization.task1;


public class Main {
    public static void main(String[] args) {
        AutoDealer dealer = new AutoDealer();
        Producer producer = new Producer(dealer);
        Thread producerThread = new Thread(producer);
        producerThread.setName("Завод 1");


        Buyer buyer1 = new Buyer(dealer);
        Buyer buyer2 = new Buyer(dealer);
        Thread buyer1Thread = new Thread(buyer1);
        buyer1Thread.setName("Покупатель 1");

        Thread buyer2Thread = new Thread(buyer2);
        buyer2Thread.setName("Покупатель 2");

        producerThread.start();
        buyer1Thread.start();
        buyer2Thread.start();

    }
}
