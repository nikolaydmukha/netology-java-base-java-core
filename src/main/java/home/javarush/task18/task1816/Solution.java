package main.java.home.javarush.task18.task1816;

import java.util.stream.Stream;

/* 
Преобразование данных-2
*/

public class Solution {

    public static void main(String[] args) {
        Stream<String> stream = Stream.of("Не", "волнуйтесь", "если", "что-то", "не", "работает.", "Если", "бы", "всё", "работало", "вас", "бы", "уволили.");

        toUpperCase(stream).forEach(System.out::println);

//        toUpperCase(stream).filter(item -> item.equalsIgnoreCase("бы")).forEach(item -> System.out.println(item));

    }

    public static Stream<String> toUpperCase(Stream<String> strings) {
        //напишите тут ваш код
        Stream<String> stringsStream = strings.map(item -> item.toUpperCase());
        return stringsStream;
    }
}
