package main.java.home.netology.collections.queuecollection.transactions;

import java.math.BigDecimal;

public class Account<T> {
    T id;
    int account;
    User user;
    BigDecimal amount;

    public Account(T id, int account, User user, BigDecimal amount) {
        this.id = id;
        this.account = account;
        this.user = user;
        this.amount = amount;
    }

    public T getId() {
        return id;
    }

    public void setId(T id) {
        this.id = id;
    }

    public int getAccount() {
        return account;
    }

    public void setAccount(int account) {
        this.account = account;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return String.format("Счет номер: %s, владелец: %s, баланс: %s", account, user.getName() + " " + user.getLastName(), amount);
    }
}
