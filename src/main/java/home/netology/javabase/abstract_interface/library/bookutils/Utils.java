package home.netology.javabase.abstract_interface.library.bookutils;

import home.netology.javabase.abstract_interface.library.Book;
import home.netology.javabase.abstract_interface.library.BooksDataBase;

public class Utils {
    public static int getBookIdFromDB(Book book) {
        return BooksDataBase.getAllBooks().indexOf(book);
    }

    public static Book getBookFromDB(Book book) {
        return BooksDataBase.getAllBooks().get(getBookIdFromDB(book));
    }
}
