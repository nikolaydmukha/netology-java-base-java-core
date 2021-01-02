package main.java.home.netology.OOP.inheritance.booksgenre.bookvolume;

import main.java.home.netology.OOP.inheritance.booksgenre.GenreEnum;

public class NovelGenre extends GenreByNumberOfPages {
    private int maxPages;

    public NovelGenre(String attribute) {
        super(attribute);
        maxPages = 3000;
    }

    @Override
    public String getGenreName() {
        return GenreEnum.NOVEL.name();
    }

    public int getMaxPages() {
        return maxPages;
    }
}
