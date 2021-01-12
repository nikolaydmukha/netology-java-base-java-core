package main.java.home.netology.javabase.OOP.inheritance.booksgenre.bookform;

import main.java.home.netology.javabase.OOP.inheritance.booksgenre.Genre;

public class GenreByForm extends Genre {
    public GenreByForm(String attribute) {
        super("Жанр по форме текста");
    }

    public String getAttributeOfGenre() {
        return attribute;
    }
}
