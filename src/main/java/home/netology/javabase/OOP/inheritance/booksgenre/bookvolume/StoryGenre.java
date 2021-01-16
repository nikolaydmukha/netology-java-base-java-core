package home.netology.javabase.OOP.inheritance.booksgenre.bookvolume;

import home.netology.javabase.OOP.inheritance.booksgenre.GenreEnum;

public class StoryGenre extends GenreByNumberOfPages {
    private int maxPages;

    public StoryGenre(String attribute) {
        super(attribute);
        maxPages = 5000;
    }

    @Override
    public String getGenreName() {
        return GenreEnum.STORY.name();
    }

    public int getMaxPages() {
        return maxPages;
    }
}
