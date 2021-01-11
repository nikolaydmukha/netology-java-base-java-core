package main.java.home.javarush.task18.task1812;

import java.util.Comparator;

public class LangComparator implements Comparator<Language> {

    @Override
    public int compare(Language o1, Language o2) {
        if (o1.getRanking() < o2.getRanking()){
            return 1;
        }else if (o1.getRanking() > o2.getRanking()) {
            return -1;
        }else {
            return 0;
        }
    }


}
