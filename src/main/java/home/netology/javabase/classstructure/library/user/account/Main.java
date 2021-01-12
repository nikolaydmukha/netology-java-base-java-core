package main.java.home.netology.javabase.classstructure.library.user.account;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        //Create Books
        Book book1 = new Book("Война и Мир 1", 5000, 1958);
        Book book11 = new Book("Война и Мир 2", 5000, 1958);

        Book book2 = new Book("Евгений Онегин 1", 2000, 1858);
        Book book22 = new Book("Евгений Онегин 2", 2000, 1858);

        Book book3 = new Book("Отцы и дети 1", 2500, 1918);
        Book book33 = new Book("Отцы и дети 2", 2500, 1918);

        //Create Authors and push the books to the book list
        Author tolstoy = new Author("Лев", "Толстой",
                new SimpleDateFormat("20-05-1900", Locale.getDefault()), new ArrayList<>());
        Author pushkin = new Author("Александр", "Пушкин",
                new SimpleDateFormat("20-05-1800", Locale.getDefault()), new ArrayList<>());
        Author nekrasov = new Author("Николай", "Некрасов",
                new SimpleDateFormat("20-05-1700", Locale.getDefault()), new ArrayList<>());

        tolstoy.addBook(book1);
        tolstoy.addBook(book11);

        pushkin.addBook(book2);
        pushkin.addBook(book22);

        nekrasov.addBook(book3);
        nekrasov.addBook(book33);

        //Create Users
        User me = new User("Николай", "Дмуха", "Москва, Профсоюзная", new ArrayList<>());
        User she = new User("Юлия", "Дмуха", "Москва, Профсоюзная", new ArrayList<>());

        //Demo
        System.out.println("Me\n");
        me.giveBook(book22);
        printAllBooks(me.getAllBooks());
        me.giveBook(book1);
        printAllBooks(me.getAllBooks());
        System.out.println("\n");

        System.out.println("She\n");
        she.giveBook(book33);
        printAllBooks(she.getAllBooks());
        she.getBackBook(book33);
        printAllBooks(she.getAllBooks());
        System.out.println("\n");

        System.out.println("Книги автора " + tolstoy.getFirstName() + " " + tolstoy.getLastName() + "\n");
        printAllBooks(tolstoy.getAllBooks());

        System.out.println("Книги выданы " + User.totalUser + " пользователям.");
        System.out.printf("Читатель %s %s читает книги: %s", me.getFirstName(), me.getLastName(), me.toString());
    }

    public static void printAllBooks(ArrayList<Book> books) {
        for (Book book : books) {
            book.showInfo();
        }
    }
}
