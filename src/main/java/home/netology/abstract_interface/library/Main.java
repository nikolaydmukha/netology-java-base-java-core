package main.java.home.netology.abstract_interface.library;

public class Main {
    public static void main(String[] args) {

        //Create the books and fill books DB
        Book book1 = new Book("Книга 1", "Автор 1");
        Book book2 = new Book("Книга 2", "Автор 2");
        Book book3 = new Book("Книга 3", "Автор 3");
        Book book4 = new Book("Книга 4", "Автор 4");
        BooksDataBase.addBookToBooksDataBase(book1);
        BooksDataBase.addBookToBooksDataBase(book2);
        BooksDataBase.addBookToBooksDataBase(book3);
        BooksDataBase.addBookToBooksDataBase(book4);


        User user1 = new User("Читатель", "1");
        user1.getBooksList();                       //список книг читателя
        user1.getBook(book1);                       //читатель взял книгу
        user1.getBooksList();                       //список книг читателя

        Distributor distributor1 = new Distributor("Поставщик 1", "1", "Читай-город");
        Distributor distributor2 = new Distributor("Поставщик 2", "2", "Дрофа");
        distributor1.getBook(book2);                //дистрибьютор попросил почитать книгу
        distributor1.getBooksList();                //список книг дистрибьютора
        distributor2.shippingBooks();
        distributor1.callToLibrary();

        Librarian librarian = new Librarian();
        Administrator administrator = new Administrator();
        librarian.giveBook(user1, book2);
        librarian.communicateWithAdmin();
        user1.getBooksList();                       //список книг читателя
        administrator.orderBooks();
        administrator.paySalary();

        //Show actual books status
        for (Book book : BooksDataBase.getAllBooks()){
            System.out.printf("Книга '%s', автор %s, статус %s, %s\n",
                    book.getTitle(), book.getAuthor(), book.getBookStatus(),
                    book.getReadBy() != null ? "читает " + book.getReadBy().userName : "книга доступна к выдаче");
        }
    }
}
