package main.java.home.netology.OOP.inheritance.booksgenre;

public class Book {
    private String title;
    private String author;
    private Genre[] genres;

    public Book(String title, String author, Genre[] genres) {
        this.title = title;
        this.author = author;
        this.genres = genres;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

        public String getGenresList() {
        StringBuilder allTitles = new StringBuilder();
        String delimiter = "";
        for (Genre genre: genres) {
            allTitles.append(delimiter);
            allTitles.append(genre.getGenreName());
            delimiter = ", ";
        }
        return allTitles.toString();
    }
    public Genre[] getGenres() {
        return genres;
    }


    @Override
    public String toString() {
        return title;
    }
}
