package main.java.home.javarush.javaCore.task14.task1417;

public class Hryvnia extends Money{

    public Hryvnia(double amount) {
        super(amount);
    }

    @Override
    public String getCurrencyName() {
        return "UAH";
    }
}
