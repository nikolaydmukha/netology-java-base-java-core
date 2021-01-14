package main.java.home.javarush.javaCore.task14.task1408;

import java.util.Formatter;

public class RussianHen extends Hen {
    private final String country = Country.RUSSIA;

    @Override
    public int getCountOfEggsPerMonth() {
        return 30;
    }

    public String getDescription() {
        Formatter f = new Formatter();
        return super.getDescription() + " Моя страна - " + country + f.format(". Я несу %d яиц в месяц.", this.getCountOfEggsPerMonth());
    }
}
