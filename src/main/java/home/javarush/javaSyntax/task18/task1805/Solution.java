package main.java.home.javarush.javaSyntax.task18.task1805;

import java.util.ArrayList;
import java.util.Collections;

/* 
Прощание с лямбда-выражением
*/

public class Solution {

    public static void main(String[] args) {
        var strings = new ArrayList<String>();

        Collections.addAll(strings, "JavaRush", "Amigo", "Java Developer", "CodeGym");

        sortStringsByLength(strings);
        strings.forEach(System.out::println);
    }

    public static void sortStringsByLength(ArrayList<String> strings) {
        StringComparator customComp = new StringComparator();

        Collections.sort(strings, customComp);
    }
}
