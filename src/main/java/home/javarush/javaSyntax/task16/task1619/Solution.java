package main.java.home.javarush.javaSyntax.task16.task1619;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Solution {

    static LocalDateTime localDateTime = LocalDateTime.now();

    public static void main(String[] args) {
        //напишите тут ваш код
//        В методе main выведи на экран переменную localDateTime в таком виде: 19.03.2020г. 5ч.4мин
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd.MM.yyyyг. Hч.mмин");
        String text = dateTimeFormatter.format(localDateTime);
        System.out.println(text);
    }
}
