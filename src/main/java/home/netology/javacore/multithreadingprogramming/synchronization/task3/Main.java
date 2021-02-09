package home.netology.javacore.multithreadingprogramming.synchronization.task3;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        Cafe cafe = new Cafe();

        Customer customer1 = new Customer(cafe);
        Customer customer2 = new Customer(cafe);
        Customer customer3 = new Customer(cafe);
        Customer customer4 = new Customer(cafe);
        Customer customer5 = new Customer(cafe);

        Waiter waiter1 = new Waiter(cafe);
        Waiter waiter2 = new Waiter(cafe);
        Waiter waiter3 = new Waiter(cafe);
        Waiter waiter4 = new Waiter(cafe);
        Waiter waiter5 = new Waiter(cafe);

        Thread threadWaiter1 = new Thread(waiter1);
        threadWaiter1.setName("Официант 1");
        Thread threadWaiter2 = new Thread(waiter2);
        threadWaiter2.setName("Официант 2");
        Thread threadWaiter3 = new Thread(waiter3);
        threadWaiter3.setName("Официант 3");
        Thread threadWaiter4 = new Thread(waiter4);
        threadWaiter4.setName("Официант 4");
        Thread threadWaiter5 = new Thread(waiter5);
        threadWaiter5.setName("Официант 5");

        Thread threadCustomers1 = new Thread(customer1);
        threadCustomers1.setName("Посетитель 1");
        Thread threadCustomers2 = new Thread(customer2);
        threadCustomers2.setName("Посетитель 2");
        Thread threadCustomers3 = new Thread(customer3);
        threadCustomers3.setName("Посетитель 3");
        Thread threadCustomers4 = new Thread(customer4);
        threadCustomers4.setName("Посетитель 4");
        Thread threadCustomers5 = new Thread(customer5);
        threadCustomers5.setName("Посетитель 5");

        threadWaiter1.start();
        threadWaiter2.start();
        threadWaiter3.start();
        threadWaiter4.start();
        threadWaiter5.start();

        Thread.sleep(5000);
        threadCustomers1.start();
        Thread.sleep(5000);
        threadCustomers2.start();
        threadCustomers3.start();
        threadCustomers4.start();
        Thread.sleep(5000);
        threadCustomers5.start();

    }
}
