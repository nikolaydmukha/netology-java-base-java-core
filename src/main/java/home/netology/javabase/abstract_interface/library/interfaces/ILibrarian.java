package home.netology.javabase.abstract_interface.library.interfaces;

import home.netology.javabase.abstract_interface.library.Book;
import home.netology.javabase.abstract_interface.library.LibraryReader;

public interface ILibrarian extends IAdministrator{

    void communicateWithAdmin();
    void giveBook(LibraryReader libraryReader, Book book);

}
