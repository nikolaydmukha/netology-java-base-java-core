package main.java.home.netology.classstructure.library.user.account;

import java.text.SimpleDateFormat;
import java.util.ArrayList;

public class Author {

    private String firstName;
    private String lastName;
    private SimpleDateFormat birth;
    private ArrayList<Book> allBooks;

    public Author(String firstName, String lastName, SimpleDateFormat birth, ArrayList<Book> allBooks) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birth = birth;
        this.allBooks = allBooks;

    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public SimpleDateFormat getBirth() {
        return birth;
    }

    public ArrayList<Book> getAllBooks() {
        return allBooks;
    }

    public void addBook(Book book) {
        allBooks.add(book);
    }

}
