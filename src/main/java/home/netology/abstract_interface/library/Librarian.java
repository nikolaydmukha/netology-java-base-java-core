package main.java.home.netology.abstract_interface.library;

import main.java.home.netology.abstract_interface.library.bookutils.Utils;
import main.java.home.netology.abstract_interface.library.interfaces.ILibrarian;

public class Librarian implements ILibrarian {

    @Override
     public void giveBook(LibraryReader libraryReader, Book wantedBook) {
        Book book = Utils.getBookFromDB(wantedBook);
        if (book.getTitle().equals(wantedBook.getTitle())) {
            book.setBookStatus(Statuses.ISSUED);
            BooksDataBase.changeReader(book, libraryReader);
        }
    }

    @Override
    public void communicateWithAdmin() {
        System.out.println("Обсудить с администратором текущее положение дел.");
    }

    @Override
    public void orderBooks() {
        System.out.println("Предложить администратору список книг для поставки.");
    }

    @Override
    public void paySalary() {
        System.out.println("Проверить расчетную ведомость.");
    }
}

