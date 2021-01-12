package main.java.home.javarush.javaSyntax.task18.task1805;

import java.util.Comparator;

public class StringComparator implements Comparator<String> {
    public int compare(String o1, String o2) {
        int diff = o1.length() - o2.length();
        if (diff < 0) {
            return -1;
        }else if (diff > 0){
            return 1;
        }else {
            return 0;
        }
    }
}
