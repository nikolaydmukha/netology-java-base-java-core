package home.netology.javacore.streams.sometasks.task7;

import home.netology.javacore.streams.sometasks.task6.People;
import home.netology.javacore.streams.sometasks.task6.Sex;

import java.util.Arrays;
import java.util.Collection;

public class Main {
    public static void main(String[] args) {
        Collection<Integer> collection = Arrays.asList(1, 2, 3, 4, 2);
        Collection<People> peoples = Arrays.asList(
                new People("Вася", 16, Sex.MAN),
                new People("Петя", 23, Sex.MAN),
                new People("Елена", 42, Sex.WOMEN),
                new People("Иван Иванович", 69, Sex.MAN)
        );

        //Получить сумму чисел или вернуть 0
        System.out.println(collection.stream().reduce((item1, item2) -> item1 + item2).orElse(0));

        //Вернуть максимум или -1
        System.out.println(collection.stream().reduce(Integer::max).orElse(-1));

        //Вернуть сумму нечетных чисел или 0
        System.out.println(collection.stream().filter(item -> item % 2 != 0).reduce((item1, item2) -> item1 + item2).orElse(0));

        //Найдем самого старшего мужчину
        int old = peoples.stream().filter(p -> p.getSex() == Sex.MAN).map(People::getAge).reduce((p1, p2) -> p1 > p2 ? p1 : p2).get();
        System.out.println(old);

        //Найдем самого минимальный возраст человека у которого есть бука е в имени
        int yong = peoples.stream().filter(p -> p.getName().contains("е")).map(People::getAge).reduce((p1, p2) -> p1 < p2 ? p1 : p2).get();
        System.out.println(yong);

    }
}
