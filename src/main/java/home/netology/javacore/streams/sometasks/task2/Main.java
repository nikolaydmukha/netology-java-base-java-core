package home.netology.javacore.streams.sometasks.task2;

import java.util.Arrays;
import java.util.Collection;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        System.out.println();
        System.out.println("Test filter and count start");
        Collection<String> collection = Arrays.asList("a1", "a2", "a3", "a1");
        Collection<People> peoples = Arrays.asList(
                new People("Вася", 16, Sex.MAN),
                new People("Ваня", 18, Sex.MAN),
                new People("Петя", 23, Sex.MAN),
                new People("Елена", 42, Sex.WOMEN),
                new People("Иван Иванович", 69, Sex.MAN)
        );
        //Выбрать мужчин-военнообязанных (от 18 до 27 лет)
        System.out.println(peoples.stream()
                .filter(item -> item.getAge() >= 18 && item.getAge() <= 27 && item.getSex() == Sex.MAN)
                .collect(Collectors.toList()));

        //Найти средний возраст среди мужчин
        System.out.println(peoples.stream()
                .filter(item -> item.getSex() == Sex.MAN)
                .mapToInt(People::getAge)
                .average()
                .getAsDouble());

        //Найти кол-во потенциально работоспособных людей в выборке (т.е. от 18 лет и учитывая что женщины выходят в 55 лет, а мужчина в 60)
        System.out.println(peoples.stream()
                .filter(item -> (item.getAge() >= 18 && item.getAge() <= 60 && item.getSex() == Sex.MAN) ||
                        (item.getAge() >= 18 && item.getAge() <= 55 && item.getSex() == Sex.WOMEN))
                .count());
    }
}
