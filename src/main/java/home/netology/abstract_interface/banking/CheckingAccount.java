package main.java.home.netology.abstract_interface.banking;

public class CheckingAccount extends Account {
    private int balance;

    public CheckingAccount(int balance) {
        if (balance < 0) {
            throw new IllegalArgumentException("Баланc расчетного счета не может отрицательным");
        }
        this.balance = balance;
    }

    public int getBalance() {
        return balance;
    }

    @Override
    public void pay(int amount) {
        if (balance - amount < 0) {
            throw new IllegalArgumentException("Сумма оплаты слишком большая. Баланс расчетного счета " +
                    "не может быть отрицательным!");
        }
        balance -= amount;
    }

    @Override
    public void transfer(Account account, int amount) {
        if (balance - amount < 0) {
            throw new IllegalArgumentException("Сумма перевода больше, чем баланс счета. Баланс расчетного счета " +
                    "не может быть отрицательным!");
        }
        balance -= amount;
        account.addMoney(amount);
    }

    @Override
    public void addMoney(int amount) {
        balance += amount;
    }
}
