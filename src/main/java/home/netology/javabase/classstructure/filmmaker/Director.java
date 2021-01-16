package home.netology.javabase.classstructure.filmmaker;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class Director {
    private String firstName;
    private String lastName;
    private ArrayList<Film> films;
    private LocalDate birthDate;
    final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");

    public Director(String firstName, String lastName, String birth) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = LocalDate.parse(birth, formatter);    //"03.12.2020"
        this.films = new ArrayList<>();
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public LocalDate getBirth() {

        return birthDate;
    }

    public void changeBirthDate(String birth) {
        this.birthDate = LocalDate.parse(birth, formatter);
    }

    public ArrayList<Film> getFilms() {
        return films;
    }

    public void addFilms(Film film) {
        this.films.add(film);
    }
}
