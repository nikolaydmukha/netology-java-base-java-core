package main.java.home.javarush.javaCore.task14.task1408;

import java.util.Formatter;

public class UkrainianHen extends Hen {
    private final String country = Country.UKRAINE;

    @Override
    public int getCountOfEggsPerMonth() {
        return 5;
    }

    public String getDescription() {
        Formatter f = new Formatter();
        return super.getDescription() + " Моя страна - " + country + f.format(". Я несу %d яиц в месяц.", this.getCountOfEggsPerMonth());
    }
}
