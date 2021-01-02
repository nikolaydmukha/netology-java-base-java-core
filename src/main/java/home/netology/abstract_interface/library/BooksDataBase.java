package main.java.home.netology.abstract_interface.library;

import main.java.home.netology.abstract_interface.library.bookutils.Utils;

import java.util.ArrayList;

public class BooksDataBase {
    private static ArrayList<Book> booksDataBase = new ArrayList<>();

    public static ArrayList<Book> getAllBooks() {
        return booksDataBase;
    }

    public static void addBookToBooksDataBase(Book book) {
        BooksDataBase.booksDataBase.add(book);
    }

    public static void changeReader(Book book, LibraryReader libraryReader){
        Utils.getBookFromDB(book).setReadBy(libraryReader);
    }
}
