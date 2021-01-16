package home.netology.javabase.abstract_interface.banking;

public abstract class Account {
    public abstract void pay(int amount);
    public abstract void  transfer(Account account, int amount);
    public abstract void addMoney(int amount);
}
