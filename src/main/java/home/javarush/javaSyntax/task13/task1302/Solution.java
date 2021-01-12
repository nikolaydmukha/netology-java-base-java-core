package main.java.home.javarush.javaSyntax.task13.task1302;

import java.util.HashSet;

import static java.util.Arrays.asList;
import static java.util.Arrays.sort;

/* 
Проверка присутствия
*/

public class Solution {
    public static HashSet<String> words = new HashSet<>(asList("Если бы меня попросили выбрать язык на замену Java я бы не выбирал".split(" ")));

    public static void checkWords(String word) {
        if (words.contains(word) == true) {
            System.out.println("Слово "+ word + " есть в множестве");
        } else {
            System.out.println("Слова "+ word + " нет в множестве");
        }
    }

    public static void main(String[] args) {
        checkWords("JavaScript");
        checkWords("Java");
    }
}
