package home.netology.javacore.streams.population;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Jack", "Connor", "Harry", "George", "Samuel", "John");
        List<String> surnames = Arrays.asList("Evans", "Young", "Harris", "Wilson", "Davies", "Adamson", "Brown");
        Collection<Person> persons = new ArrayList<>();

        for (int i = 0; i < 10_000_000; i++) {
            persons.add(new Person(
                    names.get(new Random().nextInt(names.size())),
                    surnames.get(new Random().nextInt(surnames.size())),
                    new Random().nextInt(100),
                    Sex.values()[new Random().nextInt(Sex.values().length)],
                    Education.values()[new Random().nextInt(Education.values().length)])
            );
        }
        //Количество несовершеннолетних
        Stream<Person> youngPersons = persons.stream().filter(item -> item.getAge() < 18);
        System.out.printf("Число несовершеннолетних людей %d на численность %d\n", youngPersons.count(), persons.size());

        //Призывники
        List<String> militaryPersons = persons
                .stream()
                .filter(item -> item.getAge() >= 18 && item.getAge() <= 27)
                .filter(item -> item.getSex() == Sex.MAN)
                .map(item -> item.getSurname() + ", " + item.getSex() + ", " + item.getAge())
                .collect(Collectors.toList());
        System.out.println(militaryPersons.toString());

        //Получить отсортированный по фамилии список потенциально работоспособных людей с высшим образованием в выборке
        //(т.е. людей с высшим образованием от 18 до 60 лет для женщин и до 65 лет для мужчин).
        List<Person> workerPersons = persons
                .stream()
                .filter(item -> (item.getAge() >= 18 && item.getAge() <=65 && item.getSex() == Sex.MAN) ||
                (item.getAge() >= 18 && item.getAge() <=60 && item.getSex() == Sex.WOMAN))
                .sorted(new PersonComparator())
                .collect(Collectors.toList());

    }
}
