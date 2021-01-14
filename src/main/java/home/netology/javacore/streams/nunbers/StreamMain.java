package main.java.home.netology.javacore.streams.nunbers;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamMain {
    public static void main(String[] args) {

        ArrayList<Integer> arr = new ArrayList<>() {{
            add(1);
            add(2);
            add(5);
            add(16);
            add(-1);
            add(-2);
            add(0);
            add(32);
            add(3);
            add(5);
            add(8);
            add(23);
            add(4);
        }};

        //Отфильтруйте положительные числа.
        Stream<Integer> positiveNumbers = arr.stream().filter(item -> item > 0);
        //positiveNumbers.forEach(System.out::println);

        //Найдите среди этих положительных чисел четные.
        Stream<Integer> evenNumbers = positiveNumbers.filter(item -> item % 2 == 0);
        //evenNumbers.forEach(System.out::println);

        //Отсортируйте отфильтрованные числа в порядке возрастания.
        Stream<Integer> sortedPositiveEvenNumbers = evenNumbers.sorted(Comparator.naturalOrder());
        sortedPositiveEvenNumbers.collect(Collectors.toList()).forEach(System.out::println);
    }
}
