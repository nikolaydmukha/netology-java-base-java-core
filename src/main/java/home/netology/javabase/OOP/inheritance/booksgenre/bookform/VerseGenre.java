package home.netology.javabase.OOP.inheritance.booksgenre.bookform;

import home.netology.javabase.OOP.inheritance.booksgenre.GenreEnum;

public class VerseGenre extends GenreByForm {
    public VerseGenre(String attribute) {
        super(attribute);
    }

    @Override
    public String getGenreName() {
        return GenreEnum.VERSE.name();
    }
}
