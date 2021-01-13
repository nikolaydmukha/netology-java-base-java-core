package main.java.home.netology.javacore.lambda.functionalinterface;


import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
        //1. Написать лямбда выражение для интерфейса Printable, который содержит один метод void print().
        System.out.println("#1.");
        PrintableMy printer = x -> System.out.println(x);
        printer.print("10s");

        //2. Создать лямбда выражение, которое возвращает значение true, если строка не null, используя функциональный
        //интерфейс Predicate.
        System.out.println("\n#2.");
        Predicate<String> isNull = x -> x == null;
        String str1 = null;
        System.out.println(isNull.test(str1));
        System.out.println(isNull.test("str"));

        //3. Создать лямбда выражение, которое проверяет, что строка не пуста, используя функциональный интерфейс
        //Predicate.
        System.out.println("#\n3.");
        Predicate<String> isEmpty = x -> x.equals("");
        String str2 = "";
        System.out.println(isEmpty.test(str2));
        System.out.println(isEmpty.test("str"));

        //4. Написать программу проверяющую, что строка не null и не пуста, используя метод and() функционального
        //интерфейса Predicate.
        System.out.println("\n#4.");
        System.out.println(isNull.and(isEmpty).test(str2));

        //5. Написать программу, которая проверяет, что строка начинается буквой “J”или “N” и заканчивается “A”.
        //Используем функциональный интерфейс Predicate.
        System.out.println("\n#5.");
        Predicate<String> isStartWith = x -> x.startsWith("A") || x.startsWith("J");
        Predicate<String> isEndWith = x -> x.endsWith("A");
        System.out.println(isStartWith.and(isEndWith).test("JAVA"));

        //6. Написать лямбда выражение, которое принимает на вход объект типа HeavyBox и выводит на консоль сообщение
        //“Отгрузили ящик с весом n”. “Отправляем ящик с весом n” Используем функциональный интерфейс Consumer и метод
        //по умолчанию andThen.
        System.out.println("\n#6.");
        HeavyBox box = new HeavyBox(100);
        Consumer<Integer> printerSendBox = x -> System.out.printf("Отгрузили ящик с весом %d.", x);
        Consumer<Integer> printerGetBox = x -> System.out.printf("Отправляем ящик с весом %d.", x);
        printerSendBox.andThen(printerGetBox).accept(box.getWeight());

        //Написать лямбда выражение, которое принимает на вход число и возвращает значение “Положительное число”,
        //“Отрицательное число” или  “Ноль”. Используем функциональный интерфейс Function.
        System.out.println("\n#7.");
        Function<Integer, Integer> convert = x -> {
            if (x == 0) {
                return 0;
            } else if (x < 0) {
                return x * -1;
            } else {
                return x * -1;
            }
        };
        System.out.println(convert.apply(10));
        System.out.println(convert.apply(-10));
        System.out.println(convert.apply(0));

        //Написать лямбда выражение, которое возвращает случайное число от 0 до 10. Используем функциональный
        //интерфейс Supplier.
        System.out.println("\n#8.");
        Supplier<Integer> randomize = () -> Integer.valueOf((int) (Math.random() * 10) + 0);
        System.out.println(randomize.get());

        //Переделать класс использующий Printable используя ссылку на статический метод.
        System.out.println("\n#9.");
        Consumer<String> printer2 = Main::printForPoint9;
        printer2.accept("10s");

    }

    private static void printForPoint9(String s) {
        System.out.println("Point 9");
    }
}
