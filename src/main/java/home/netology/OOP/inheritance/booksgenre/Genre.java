package main.java.home.netology.OOP.inheritance.booksgenre;

public class Genre {
    protected String attribute;

    public Genre(String attribute) {
        this.attribute = attribute;
    }

    public String getAttributeOfGenre() {
        return attribute;
    }

    public String getGenreName() {
        return "Жанр не указан!";
    }
}
