package main.java.home.netology.classstructure.filmmaker;

public class Film {
    private String title;
    private int year;
    private int duration;

    public Film(String title, int year, int duration) {
        this.title = title;
        this.year = year;
        this.duration = duration;
    }

    public String getTitle() {
        return title;
    }

    public int getYear() {
        return year;
    }

    public int getDuration() {
        return duration;
    }
}
