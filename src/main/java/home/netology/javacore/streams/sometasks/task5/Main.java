package main.java.home.netology.javacore.streams.sometasks.task5;

import java.util.Arrays;
import java.util.Collection;

public class Main {
    public static void main(String[] args) {
        System.out.println("Test map start");
        Collection<String> collection = Arrays.asList("a1", "a2", "a3", "a1");
        Collection<String> collection2 = Arrays.asList("1,2,0", "4,5");

        //Добавить "_1" к каждому элементу первой коллекции
        collection.stream()
                .map(item -> item.concat("_1"))
                .forEach(System.out::println);

        //В первой коллекции убрать первый символ и вернуть массив чисел (int[]
        collection.stream()
                .mapToInt(item -> Integer.parseInt(item.substring(1)))
                .forEach(System.out::println);

        //Из второй коллекции получить все числа, перечисленные через запятую из всех элементов
        collection2.stream()
                .flatMap(item -> Arrays.asList(item.split(","))
                        .stream())
                .forEach(System.out::println);

        //Из второй коллекции получить сумму всех чисел, перечисленных через запятую
        collection2.stream().flatMapToInt((item) -> Arrays.asList(item.split(",")).stream().mapToInt(Integer::parseInt)).sum();
    }
}
