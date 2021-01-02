package main.java.home.netology.OOP.inheritance.booksgenre.bookcontent;

import main.java.home.netology.OOP.inheritance.booksgenre.GenreEnum;

public class ProfessionalGenre extends GenreByContent{

    public ProfessionalGenre(String attribute) {
        super(attribute);
    }

    @Override
    public String getGenreName() {
        return GenreEnum.PROFESSIONAL.name();
    }

}
