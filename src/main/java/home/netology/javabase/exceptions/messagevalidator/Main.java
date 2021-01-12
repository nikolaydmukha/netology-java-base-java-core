package main.java.home.netology.javabase.exceptions.messagevalidator;

public class Main {
    public static void main(String[] args) {
        for (Event event: getMovies()) {
            validEvent(event);
        }
        for (Event event: getTheatres()) {
            validEvent(event);
        }
        System.out.println("Все события корректны");
    }

    public static void validEvent(Event event){
        if (event.getAge() == 0 || event.getReleaseYear() == 0 || event.getTitle() == null){
            throw new RuntimeException("Please fill all the event`s features!");
        }
    }

    public static Movie[] getMovies() {
        return new Movie[]{
                new Movie("Начало 1", 2010, (byte) 16),
                new Movie("Начало 2", 2010, (byte) 16),
                new Movie(null, 2010, (byte) 16),
                new Movie("Начало 4", 0 , (byte) 16),
                new Movie("Начало 5", 2010, (byte) 0)

        };
    }

    public static Theatre[] getTheatres() {
        return new Theatre[]{
                new Theatre("Анна Каренина 1", 2017, (byte) 16),
                new Theatre("Анна Каренина 2", 2017, (byte) 16),
                new Theatre(null, 2017, (byte) 0),
                new Theatre("Анна Каренина", 0, (byte) 16)
        };
    }

}
