package home.netology.javabase.classstructure.filmmaker;

public class Main {
    public static void main(String[] args) {
        Film film1 = new Film("Большой куш", 2010, 90);
        Film film2 = new Film("Шерлок холмс", 2009, 125);
        Director guyReache = new Director("Гай", "Ричи", "10.09.1968");
        guyReache.addFilms(film1);
        guyReache.addFilms(film2);
        System.out.println(guyReache.getFirstName() + " " + guyReache.getLastName() + " " + guyReache.getBirth() + " г.р.");
        System.out.println("Фильмография:");
        for(Film film : guyReache.getFilms()){
            System.out.println(film.getTitle() + ", " + film.getYear() + " г., " + film.getDuration() + " мин.");
        }
    }
}
