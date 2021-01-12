package main.java.home.netology.javabase.abstract_interface.banking;

public class CreditAccount extends Account {
    private int balance;

    public CreditAccount(int balance) {
        if (balance > 0) {
            throw new IllegalArgumentException("Баланc кредитного счета не может положительным");
        }
        this.balance = balance;
    }

    public int getBalance() {
        return balance;
    }

    @Override
    public void pay(int amount) {
        balance -= amount;
    }

    @Override
    public void transfer(Account account, int amount) {
        balance -= amount;
        account.addMoney(amount);
    }

    @Override
    public void addMoney(int amount) {
        if (balance + amount > 0) {
            throw new IllegalArgumentException("Баланс кредитного счета не может быть положительным!");
        }
        balance += amount;
    }
}
