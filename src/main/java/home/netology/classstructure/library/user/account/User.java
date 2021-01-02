package main.java.home.netology.classstructure.library.user.account;

import java.util.ArrayList;

public class User {

    private String firstName;
    private String lastName;
    private String address;
    private ArrayList<Book> allBooks;

    static int totalUser;

    public User(String firstName, String lastName, String address, ArrayList<Book> allBooks) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.allBooks = allBooks;
        totalUser++;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public ArrayList<Book> getBackBook(Book deleteBook) {
        allBooks.removeIf(i -> i.getTitle().equals(deleteBook.getTitle()));

        return allBooks;
    }

    public ArrayList<Book> giveBook(Book giveBook) {
        allBooks.add(giveBook);
        return allBooks;
    }

    public ArrayList<Book> getAllBooks() {
        return allBooks;
    }

    public String toString() {
        StringBuilder currentBook = new StringBuilder();
        for (Book book : allBooks) {
            currentBook.append(book.getTitle()).append("; ");
        }
        return currentBook.delete(currentBook.length() - 2, currentBook.length() - 1).toString();
    }
}
