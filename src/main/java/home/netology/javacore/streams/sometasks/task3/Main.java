package main.java.home.netology.javacore.streams.sometasks.task3;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        System.out.println();
        System.out.println("Test distinct start");
        Collection<String> ordered = Arrays.asList("a1", "a2", "a2", "a3", "a1", "a2", "a2");
        Collection<String> nonOrdered = new HashSet<>(ordered);

        // Получение коллекции без дубликатов
        System.out.println(nonOrdered.stream().distinct().collect(Collectors.toList()));

        //Получение коллекции без дубликатов из упорядоченного стрима
        System.out.println(ordered.stream().distinct().collect(Collectors.toList()));
    }
}
