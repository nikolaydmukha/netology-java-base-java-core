package home.netology.javabase.OOP.inheritance.booksgenre.bookcontent;

import home.netology.javabase.OOP.inheritance.booksgenre.GenreEnum;

public class ProfessionalGenre extends GenreByContent{

    public ProfessionalGenre(String attribute) {
        super(attribute);
    }

    @Override
    public String getGenreName() {
        return GenreEnum.PROFESSIONAL.name();
    }

}
