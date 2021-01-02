package main.java.home.netology.OOP.inheritance.booksgenre.bookcontent;

import main.java.home.netology.OOP.inheritance.booksgenre.GenreEnum;

public class DetectiveGenre extends GenreByContent{
    public DetectiveGenre(String attribute) {
        super(attribute);
    }

    @Override
    public String getGenreName() {
        return GenreEnum.DETECTIVE.name();
    }

}
