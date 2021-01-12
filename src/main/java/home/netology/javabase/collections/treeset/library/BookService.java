package main.java.home.netology.javabase.collections.treeset.library;

import java.util.*;

public class BookService {
    public static void addBookToLibrary(Scanner scanner, TreeMap<Genres, TreeSet<Book>> library) {

        while (true) {
            try {
                showGenres();
                String input = scanner.nextLine();
                int genreId = Utils.validateIntInInterval(input, Genres.values().length);
                ArrayList<String> booksFeatures = getBookFeature(scanner);
                //insert book to TreeSet
                library.get(Genres.values()[genreId - 1])
                        .add(new Book(booksFeatures.get(0), booksFeatures.get(1),
                                Integer.parseInt(booksFeatures.get(2)), Genres.values()[genreId - 1]));

                break;
            } catch (NumberFormatException | InputMismatchException exception) {
                System.err.println("Выберите пункт меню. \n");
                continue;
            } catch (WrongIntervalException exception) {
                System.err.println(exception.getMessage());
                continue;
            }
        }
    }


    public static void showGenres() {
        System.out.println("Выберите жанр:");
        int i = 1;
        for (Genres genre : Genres.values()) {
            System.out.println(i + ". " + genre);
            i++;
        }
    }

    public static ArrayList<String> getBookFeature(Scanner scanner) {
        ArrayList<String> booksFeatures = new ArrayList<>();
        System.out.println("Введите название книги:");
        String bookTitle = scanner.nextLine();
        System.out.println("Введите автора книги:");
        String bookAuthor = scanner.nextLine();
        int bookPublishedYear = 0;
        while (true) {
            try {
                System.out.println("Введите дату публикации книги:");
                bookPublishedYear = Utils.validateInt(scanner.nextLine());
                break;
            } catch (NumberFormatException | InputMismatchException exception) {
                System.err.println("Год должен быть числом. \n");
                continue;
            }
        }

        booksFeatures.add(bookTitle);
        booksFeatures.add(bookAuthor);
        booksFeatures.add(String.valueOf(bookPublishedYear));

        return booksFeatures;
    }

    public static void printBookLibrary(TreeMap<Genres, TreeSet<Book>> library) {
        for (Map.Entry<Genres, TreeSet<Book>> entry : library.entrySet()) {
            if(entry.getValue().size() > 0) {
                System.out.println("\nКниги жанра " + entry.getKey() + ":");
                for (Book book : entry.getValue()) {
                    System.out.printf("%s , %s, %sг.\n", book.getTitle(), book.getAuthor(), book.getPublishedYear());
                }
            }else {
                System.err.printf("Книг жанра %s пока не добавлено\n\n", entry.getKey());
            }
        }
    }

    public static void filterByGenre(Scanner scanner, TreeMap<Genres, TreeSet<Book>> library) {
        showGenres();
        String input = scanner.nextLine();
        while (true) {
            try {
                int genreId = Utils.validateIntInInterval(input, Genres.values().length);
                printBooksByGenre(library, genreId);
                break;
            } catch (WrongIntervalException exception) {
                System.err.println(exception.getMessage());
                continue;
            }
        }
    }

    public static void printBooksByGenre(TreeMap<Genres, TreeSet<Book>> library, int genreId) {
        if(library.get(Genres.values()[genreId - 1]).size() > 0) {
            System.out.println("\nКниги жанра " + Genres.values()[genreId - 1] + ":");
            for (Book book : library.get(Genres.values()[genreId - 1])) {
                System.out.printf("%s , %s, %sг.\n", book.getTitle(), book.getAuthor(), book.getPublishedYear());
            }
            System.out.println("\n");
        }else {
            System.err.printf("Книг жанра %s пока не добавлено\n\n", Genres.values()[genreId - 1]);
        }
    }
}
