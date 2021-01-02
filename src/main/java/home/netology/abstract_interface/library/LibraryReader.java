package main.java.home.netology.abstract_interface.library;

import main.java.home.netology.abstract_interface.library.bookutils.Utils;
import main.java.home.netology.abstract_interface.library.interfaces.IReader;

public class LibraryReader {
    public String userName;
    public String id;

    public void getBook(Book book) {
        Book wantedBook = BooksDataBase.getAllBooks().get(Utils.getBookIdFromDB(book));
        if (wantedBook.getBookStatus() == Statuses.AVAILABLE) {
            wantedBook.setBookStatus(Statuses.ISSUED);
            wantedBook.setReadBy(this);
            System.out.printf("Читатель %s с id №%s взял книгу '%s'\n", userName, id, book.getTitle());
        } else {
            System.out.printf("Книгу %s взять нельзя, т.к. она в статусе %s\n", book.getTitle(), book.getBookStatus());
        }
    }

    public void returnBook(IReader reader, Book book) {
        book.setBookStatus(Statuses.AVAILABLE);
        System.out.printf("Читатель %s с id №%s вернул книгу '%s'\n", userName, id);
    }

    public void reservedBook(IReader reader, Book book) {
        book.setBookStatus(Statuses.RESERVED);
        System.out.printf("Читатель %s с id №%s зарезервировал книгу '%s'\n", userName, id);
    }

    public void getBooksList() {
        System.out.printf("Книги читателя %s:\n", userName);
        int number = 0;
        if (BooksDataBase.getAllBooks().size() != 0) {
            for (Book book : BooksDataBase.getAllBooks()) {
                if (book.getReadBy() != null && book.getReadBy().userName.equals(this.userName)) {
                    number++;
                    System.out.printf("%d. Книга '%s'.\n", number, book.getTitle());
                }
            }
            if (number == 0) {
                System.out.printf("У читателя %s пока нет книг!\n", userName);
            }

        } else {
            System.out.println("В базе нет пока книг!");
        }
    }
}
