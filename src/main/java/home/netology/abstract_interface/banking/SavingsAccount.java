package main.java.home.netology.abstract_interface.banking;

public class SavingsAccount extends Account {
    private int balance;

    public SavingsAccount(int balance) {
        if (balance < 0 ) {
            throw new IllegalArgumentException("Баланc сберегательного счета не может отрицательным");
        }
        this.balance = balance;
    }

    public void setBalance(int balance) {
        if (this.balance + balance < 0 ) {
            throw new IllegalArgumentException("Балан сберегательного счета не может отрицательным");
        }
        this.balance += balance;
    }

    public int getBalance() {
        return balance;
    }

    @Override
    public void transfer(Account account, int amount) {
        if (balance - amount <= 0) {
            throw new IllegalArgumentException("Сумма перевода больше, чем баланс счета. Баланс сберегательного счет " +
                    "не может быть отрицательным!");
        }
        balance -= amount;
        account.addMoney(amount);
    }

    @Override
    public void addMoney(int amount) {
        this.balance += amount;
    }

    @Override
    public void pay(int amount) {
        System.out.println("Со сберегательного счёта платить запрещено!");
    }
}
