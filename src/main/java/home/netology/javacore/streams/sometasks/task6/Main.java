package main.java.home.netology.javacore.streams.sometasks.task6;

import java.util.Arrays;
import java.util.Collection;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Collection<String> collection = Arrays.asList("a1", "a4", "a3", "a2", "a1", "a4");
        Collection<People> peoples = Arrays.asList(
                new People("Вася", 16, Sex.MAN),
                new People("Петя", 23, Sex.MAN),
                new People("Елена", 42, Sex.WOMEN),
                new People("Иван Иванович", 69, Sex.MAN)
        );
        //Отсортировать коллекцию строк по алфавиту
        System.out.println(collection.stream().sorted().collect(Collectors.toList()));

        //Отсортировать коллекцию строк по алфавиту в обратном порядке
        System.out.println(collection.stream().sorted((o1,o2) -> -o1.compareTo(o2)).collect(Collectors.toList()));

        //Отсортировать коллекцию строк по алфавиту и убрать дубликаты
        System.out.println(collection.stream().sorted().distinct().collect(Collectors.toList()));

        //Отсортировать коллекцию строк по алфавиту в обратном порядке и убрать дубликаты
        System.out.println(collection.stream().sorted((o1,o2) -> -o1.compareTo(o2)).distinct().collect(Collectors.toList()));

        //Отсортировать коллекцию людей по имени в обратном алфавитном порядке
        System.out.println(peoples.stream().sorted((o1,o2) -> -o1.getName().compareTo(o2.getName())).collect(Collectors.toList()));

        //Отсортировать коллекцию людей сначала по полу, а потом по возрасту
        System.out.println(peoples.stream().sorted((o1,o2) -> o1.getSex() != o2.getSex()? o1.getSex().
                compareTo(o2.getSex()): o1.getAge().compareTo(o2.getAge())).collect(Collectors.toList()));

        //Найти максимальное значение среди коллекции строк
        System.out.println(collection.stream().distinct().max(String::compareTo));

        //Найдем человека с максимальным возрастом
        System.out.println(peoples.stream().max((p1, p2) -> p1.getAge().compareTo(p2.getAge())).get());
    }
}
