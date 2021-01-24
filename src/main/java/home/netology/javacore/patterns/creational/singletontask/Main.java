package home.netology.javacore.patterns.creational.singletontask;


import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Logger logger = Logger.getInstance();

        logger.log("Запускаем программу");
        logger.log("Просим пользователя ввести данные");

        System.out.println("Введите размер списка: ");
        int size = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Введите верхнюю границу списка:  ");
        int max = scanner.nextInt();
        scanner.nextLine();
        logger.log("Формируем список...");
        List<Integer> list = listGenerator(size, max);
        logger.log("Список готов:");
        list.stream().forEach(item -> System.out.print(item + " "));
        System.out.println();
        logger.log("Просим пользователя ввести входные данные для фильтрации");
        System.out.println("Введите порог для фильтра: ");
        int treshold = scanner.nextInt();
        scanner.nextLine();
        Filter filter = new Filter(treshold);
        logger.log("Запускаем фильтрацию...");
        List<Integer> result = filter.filterOut(list);
        logger.log("Выводим фильтрованный результат");
        if (result.isEmpty()){
            logger.log("Список получился пустым. Ни один элемент не подошел");
        }else {
            result.stream().forEach(item -> System.out.print(item + " "));
        }
        System.out.println();
        logger.log("Завершаем работу");


    }

    private static List<Integer> listGenerator(int size, int max){
        List<Integer> numbers = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i <= size; i++){
            numbers.add(random.nextInt(max));
        }

        return numbers;
    }
}
