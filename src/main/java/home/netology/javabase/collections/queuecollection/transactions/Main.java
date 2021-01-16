package home.netology.javabase.collections.queuecollection.transactions;

import java.math.BigDecimal;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Deque<Transaction> transactions = new ArrayDeque<>();

        Account account1 = new Account(100, 1020304050, new User("Mike", "Ross"), BigDecimal.valueOf(100L));
        Account account2 = new Account("VR-1000", 1000010, new User("Bill", "Short"), BigDecimal.valueOf(500L));
        Account account3 = new Account(100500, 333333, new User("John", "Vot"), BigDecimal.valueOf(1_000L));
        Account account4 = new Account(6482, 222222, new User("Nick", "Dmukha"), BigDecimal.valueOf(500L));
        Account account5 = new Account("NN-250", 11111, new User("Julia", "Dmukha"), BigDecimal.valueOf(1_000L));

        Transaction transaction1 = new Transaction(account1, account2, BigDecimal.valueOf(100L));
        Transaction transaction2 = new Transaction(account3, account4, BigDecimal.valueOf(1_000L));
        Transaction transaction3 = new Transaction(account4, account5, BigDecimal.valueOf(200L));


        transactions.add(transaction1);
        transactions.add(transaction2);
        transactions.add(transaction3);


        System.out.println("Начальное состояние счетов");
        System.out.println(account1);
        System.out.println(account2);
        System.out.println(account3);
        System.out.println(account4);
        System.out.println(account5);

        while (true) {
            Transaction t = transactions.poll();
            if (t == null) {
                break;
            }
            boolean transactionStatus = t.makeTransaction();
            if (!transactionStatus) {
                System.out.printf("Ошибка обработки транзакции: %s\n\n", t.toString());
            }
        }

        System.out.println("Конечное состояние счетов");
        System.out.println(account1);
        System.out.println(account2);
        System.out.println(account3);
        System.out.println(account4);
        System.out.println(account5);

    }
}
