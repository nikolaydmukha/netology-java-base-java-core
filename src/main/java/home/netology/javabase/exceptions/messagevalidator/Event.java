package home.netology.javabase.exceptions.messagevalidator;

public abstract class Event {
    protected String title;
    protected int releaseYear;
    protected byte age;

    public Event(String title, int releaseYear, byte age) {
        this.title = title;
        this.releaseYear = releaseYear;
        this.age = age;
    }

    public String getTitle() {
        return title;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public byte getAge() {
        return age;
    }
}
