package home.netology.javabase.OOP.inheritance.booksgenre.bookvolume;

import home.netology.javabase.OOP.inheritance.booksgenre.GenreEnum;

public class NarrativeGenre extends GenreByNumberOfPages {
    private int maxPages;

    public NarrativeGenre(String attribute) {
        super(attribute);
        maxPages = 2500;
    }

    @Override
    public String getGenreName() {
        return GenreEnum.NARRATIVE.name();
    }

    public int getMaxPages() {
        return maxPages;
    }
}
