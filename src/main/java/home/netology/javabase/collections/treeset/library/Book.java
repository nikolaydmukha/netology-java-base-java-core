package home.netology.javabase.collections.treeset.library;

public class Book {
    private String title;
    private String author;
    private int publishedYear;
    private Genres genre;

    public Book(String title, String author, int publishedYear, Genres genre) {
        this.title = title;
        this.author = author;
        this.publishedYear = publishedYear;
        this.genre = genre;
    }

    public String getTitle() {
        return title;
    }


    public String getAuthor() {
        return author;
    }

    public int getPublishedYear() {
        return publishedYear;
    }

    public Genres getGenre() {
        return genre;
    }

    @Override
    public String toString() {
        System.out.println(this.getAuthor() + ", " + this.getTitle() + ", " + this.getGenre());
        return null;
    }

}
