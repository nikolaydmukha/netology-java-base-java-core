package main.java.home.netology.javabase.OOP.inheritance.booksgenre;

import main.java.home.netology.javabase.OOP.inheritance.booksgenre.bookcontent.DetectiveGenre;
import main.java.home.netology.javabase.OOP.inheritance.booksgenre.bookcontent.FantasticGenre;
import main.java.home.netology.javabase.OOP.inheritance.booksgenre.bookcontent.ProfessionalGenre;
import main.java.home.netology.javabase.OOP.inheritance.booksgenre.bookform.ProseGenre;
import main.java.home.netology.javabase.OOP.inheritance.booksgenre.bookform.VerseGenre;
import main.java.home.netology.javabase.OOP.inheritance.booksgenre.bookvolume.NarrativeGenre;
import main.java.home.netology.javabase.OOP.inheritance.booksgenre.bookvolume.NovelGenre;
import main.java.home.netology.javabase.OOP.inheritance.booksgenre.bookvolume.StoryGenre;

public class Main {
    public static void main(String[] args) {
        //Genre contents
        FantasticGenre fantasticGenre = new FantasticGenre("Fantastic");
        ProfessionalGenre professionalGenre = new ProfessionalGenre("Professional");
        DetectiveGenre detectiveGenre = new DetectiveGenre("Detective");
        System.out.println("Атрибут: " + fantasticGenre.getAttributeOfGenre());
        System.out.println("Жанр: " + fantasticGenre.getGenreName());

        //Genre forms
        ProseGenre proseForm = new ProseGenre("Prose");
        VerseGenre verseForm = new VerseGenre("Verse");

        //Genre pages
        NovelGenre novelType = new NovelGenre("Novel");
        NarrativeGenre narrativeType = new NarrativeGenre("Narrative");
        StoryGenre storyGenre = new StoryGenre("Story");

        System.out.println("Атрибут: " + novelType.getAttributeOfGenre());
        System.out.println("Жанр: " + novelType.getGenreName());
        System.out.println("Максимальное число страниц: " + novelType.getMaxPages());

        //Create book
        Book book1 = new Book("Book1", "Author1", new Genre[]{fantasticGenre, verseForm, storyGenre});
        Book book2 = new Book("Book2", "Author2", new Genre[]{detectiveGenre, proseForm, narrativeType});
        System.out.println(book1.getGenresList());
        System.out.println(book1.toString());

        //Create bookservice object and filter
        BookService bookService = new BookService();
        Book[] booksList = new Book[]{book1, book2};

        bookService.filterBookByGenre(booksList, fantasticGenre);
    }
}
