package main.java.home.netology.collections.treeset.library;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        TreeMap<Genres, TreeSet<Book>> library = initBookMap();

        while (true) {
            menu(scanner, library);
            break;
        }
        scanner.close();
    }

    private static TreeMap<Genres, TreeSet<Book>> initBookMap() {
        TreeMap<Genres, TreeSet<Book>> library = new TreeMap<>();
        for (Genres genres : Genres.values()) {
            library.put(genres, new TreeSet<>(new BookComparator()));
        }
        return library;
    }

    private static void menu(Scanner scanner, TreeMap<Genres, TreeSet<Book>> library) {

        while (true) {
            System.out.println("Выберите действие:\n" +
                    "1. Добавить книгу\n" +
                    "2. Вывести книги всех жанров\n" +
                    "3. Вывести книгу по нужному жанру\n" +
                    "\nили нажмите Enter для завершения");
            try {
                String input = scanner.nextLine();
                if (input.isEmpty()) {
                    break;
                }
                int point = Utils.validateInt(input);
                actionExecute(point, scanner, library);
            } catch (NumberFormatException | InputMismatchException exception) {
                scanner.nextLine();
                System.err.println("Выберите пункт меню. \n");
                continue;
            }catch (IllegalArgumentException exception) {
                System.err.println(exception.getMessage());
                continue;
            }
        }

    }

    private static void actionExecute(int point, Scanner scanner, TreeMap<Genres, TreeSet<Book>> library) {
        switch (point) {
            case 1:
                BookService.addBookToLibrary(scanner, library);
                break;
            case 2:
                BookService.printBookLibrary(library);
                break;
            case 3:
                BookService.filterByGenre(scanner, library);
                break;
            default:
                throw new IllegalArgumentException("Нет такого пункта меню");
        }
    }
}
