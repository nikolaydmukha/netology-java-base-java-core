package home.netology.javacore.streams.sometasks.task4;

import java.util.Arrays;
import java.util.Collection;

public class Main {
    public static void main(String[] args) {
        System.out.println("Test anyMatch, allMatch, noneMatch  start");
        Collection<String> collection = Arrays.asList("a1", "a2", "a3", "a1");

        //Найти существуют ли хоть один «a1» элемент в коллекции
        System.out.println(collection.stream().anyMatch("a1"::equals));

        //Найти есть ли символ «1» у всех элементов коллекции
        System.out.println(collection.stream().allMatch("1"::contains));

        //Проверить что не существуют ни одного «a7» элемента в коллекции
        System.out.println(collection.stream().noneMatch("a7"::equals));
    }
}
