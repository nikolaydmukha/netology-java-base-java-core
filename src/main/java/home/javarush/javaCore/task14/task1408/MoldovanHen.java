package main.java.home.javarush.javaCore.task14.task1408;

import java.util.Formatter;

public class MoldovanHen extends Hen {
    private final String country = Country.MOLDOVA;

    @Override
    public int getCountOfEggsPerMonth() {
        return 20;
    }

    public String getDescription() {
        Formatter f = new Formatter();
        return super.getDescription() + " Моя страна - " + country + f.format(". Я несу %d яиц в месяц.", this.getCountOfEggsPerMonth());
    }
}
