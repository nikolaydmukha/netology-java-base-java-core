package main.java.home.netology.abstract_interface.library;


import main.java.home.netology.abstract_interface.library.interfaces.IReader;

public class User extends LibraryReader implements IReader {

    public User(String userName, String id) {
        this.userName = userName;
        this.id = id;
    }

    public User(String userName, String id, Book book) {
        this.userName = userName;
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public String getId() {
        return id;
    }

    @Override
    public void getDiscount() {
        System.out.println("Читатель %s (id №%s) попросил скидку, как постоянный пользователь.");
    }

}
