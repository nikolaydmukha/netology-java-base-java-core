package home.javarush.javaCore.task16.task1632.mythreads;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Thread5 extends Thread {

    @Override
    public void run() {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = new ArrayList<>();

        while (true) {
            System.out.println("Введите число: ");
            String input = scanner.nextLine();
            if (!input.equals("N")) {
                try {
                    numbers.add(Integer.valueOf(input));
                } catch (NumberFormatException e) {
                    System.err.println("Неправильный формат строки!");
                    continue;
                }
            } else {
                break;
            }
            Integer sum = numbers.stream()
                    .reduce(0, (a, b) -> a + b);
            System.out.println("Сумма: " + sum);
        }

    }
}
