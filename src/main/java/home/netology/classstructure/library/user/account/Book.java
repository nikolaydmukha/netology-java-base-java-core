package main.java.home.netology.classstructure.library.user.account;

public class Book {

    private String title;
    private int publishedYear;
    private int pages;

    public Book(String title, int pages, int publishedYear) {
        this.title = title;
        this.pages = pages;
        this.publishedYear = publishedYear;
    }

    public void showInfo() {
        String info = "Название: " + title + "\nЧисло страниц: " + pages + " \nДата публикации: " + publishedYear;
        System.out.println(info);
    }

    public String getTitle() {
        return title;
    }
}
