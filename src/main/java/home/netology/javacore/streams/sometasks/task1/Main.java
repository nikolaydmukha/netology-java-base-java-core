package main.java.home.netology.javacore.streams.sometasks.task1;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<>() {{
            add("a1");
            add("a2");
            add("a3");
            add("a4");
            add("a5");
        }};
        //Вернуть количество вхождений объекта «a1»
        System.out.println(arr.stream().filter(item -> item.equals("a1")).count());

        //Вернуть первый элемент коллекции или 0, если коллекция пуста
        System.out.println(arr.stream().findFirst().orElse("0"));

        //Вернуть последний элемент коллекции или «empty», если коллекция пуста
        System.out.println(arr.stream().skip(arr.size() - 1).findFirst().orElse("empty"));

        //Найти элемент в коллекции равный «a3» или кинуть ошибку
        System.out.println(arr.stream().filter("a3"::equals).findFirst().get());

        //Вернуть третий элемент коллекции по порядку
        System.out.println(arr.stream().skip(2).findFirst().get());

        //Вернуть два элемента начиная со второго
        System.out.println(arr.stream().skip(1).limit(2).toArray());

        //Выбрать все элементы по шаблону
        System.out.println(arr.stream().filter(item -> item.contains("a")).collect(Collectors.toList()).toString());
    }
}
