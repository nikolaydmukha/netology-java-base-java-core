package main.java.home.netology.javabase.OOP.inheritance.booksgenre.bookform;

import main.java.home.netology.javabase.OOP.inheritance.booksgenre.GenreEnum;

public class ProseGenre extends GenreByForm {

    public ProseGenre(String attribute) {
        super(attribute);
    }

    @Override
    public String getGenreName() {
        return GenreEnum.PROSE.name();
    }
}
