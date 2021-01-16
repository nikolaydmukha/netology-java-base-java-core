package home.javarush.javaSyntax.task16.task1607;

import java.time.LocalDate;
import java.time.Month;

public class Solution {

    public static void main(String[] args) {
        System.out.println(nowExample());
        System.out.println(ofExample());
        System.out.println(ofYearDayExample());
        System.out.println(ofEpochDayExample());
    }

    static LocalDate nowExample() {
        //напишите тут ваш код
        LocalDate time = LocalDate.now();
        return time;
    }

    static LocalDate ofExample() {
        //напишите тут ваш код
        LocalDate date = LocalDate.of(2020, Month.SEPTEMBER, 12);
        return date;
    }

    static LocalDate ofYearDayExample() {
        //напишите тут ваш код
        LocalDate date = LocalDate.ofYearDay(2020, 256);
        return date;
    }

    static LocalDate ofEpochDayExample() {
        //напишите тут ваш код
//        LocalDate date = LocalDate.ofEpochDay(LocalDate.of(2020, Month.SEPTEMBER, 12).toEpochDay());
        LocalDate date = LocalDate.ofEpochDay(18517);
        return date;
    }
}
