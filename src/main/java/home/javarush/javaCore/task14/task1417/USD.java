package main.java.home.javarush.javaCore.task14.task1417;

public class USD extends Money{

    public USD(double amount) {
        super(amount);
    }


    @Override
    public String getCurrencyName() {
        return "USD";
    }
}

