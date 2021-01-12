package main.java.home.javarush.javaSyntax.task13.task1301;

import java.util.HashSet;

/* 
Оформляем возврат
*/

public class Solution {

    public static void main(String[] args) {
        String[] array = {"Через", "три", "года", "я", "буду", "Senior", "Java", "Developer"};
        for(String s : array) {
            System.out.println(s);
        }
        System.out.println("___________________________________");

        HashSet<String> hashSet = arrayToHashSet(array);
        for(String s : hashSet) {
            System.out.println(s);
        }
    }

    public static HashSet<String> arrayToHashSet(String[] strings) {
        HashSet<String> myTestSet = new HashSet<>();
        for(int i = 0; i < strings.length; i++){
            myTestSet.add(strings[i]);
        }
        return myTestSet;
    }

}
