package main.java.home.javarush.javaSyntax.task16.task1601;

import java.util.Date;

public class Solution {

    static Date birthDate = new Date(2021, 00, 9);

    public static void main(String[] args) {

        System.out.println(getDayOfWeek(birthDate));
    }

    static String getDayOfWeek(Date date) {
        //напишите тут ваш код
        String result = "";
        int day = date.getDay();
//        switch (day) {
//            case 0 -> result = "воскресенье";
//            case 1 -> result = "понедельник";
//            case 2 -> result = "вторник";
//            case 3 -> result = "среда";
//            case 4 -> result = "четверг";
//            case 5 -> result = "пятница";
//            case 6 -> result = "суббота";
//        }
        return result;
    }
}
