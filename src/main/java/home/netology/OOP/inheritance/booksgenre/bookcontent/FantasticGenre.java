package main.java.home.netology.OOP.inheritance.booksgenre.bookcontent;

import main.java.home.netology.OOP.inheritance.booksgenre.GenreEnum;

public class FantasticGenre extends GenreByContent {

    public FantasticGenre(String attribute) {
        super(attribute);
    }

    @Override
    public String getGenreName() {
        return GenreEnum.FANTASTIC.name();
    }

}
