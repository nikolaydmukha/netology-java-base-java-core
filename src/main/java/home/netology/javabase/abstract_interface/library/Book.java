package main.java.home.netology.javabase.abstract_interface.library;

public class Book {
    private String title;
    private String author;
    private Statuses bookStatus;
    private LibraryReader readBy;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.bookStatus = Statuses.AVAILABLE;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public Statuses getBookStatus() {
        return bookStatus;
    }

    public void setBookStatus(Statuses bookStatus) {
        this.bookStatus = bookStatus;
    }

    public LibraryReader getReadBy() {
        return readBy;
    }

    public void setReadBy(LibraryReader readBy) {
        this.readBy = readBy;
    }
}
