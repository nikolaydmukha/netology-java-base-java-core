package main.java.home.javarush.javaCore.task14.task1417;

public class Ruble extends Money{

    public Ruble(double amount) {
        super(amount);
    }

    @Override
    public String getCurrencyName() {
        return "RUB";
    }
}
