package main.java.home.netology.OOP.inheritance.booksstatus;

public class Book {
    private String title;
    private String author;
    private Status status;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.status = Status.AVAILABLE;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
}
