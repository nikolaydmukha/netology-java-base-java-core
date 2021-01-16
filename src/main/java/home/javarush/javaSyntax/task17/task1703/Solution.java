package home.javarush.javaSyntax.task17.task1703;

import java.util.ArrayList;

/* 
Космическая одиссея ч.1
*/

public class Solution {
    public static ArrayList<Astronaut> astronauts = new ArrayList<>();

    public static void main(String[] args) {
        createCrew();
        printCrewInfo();
    }

    public static void createCrew(){
        //напишите тут ваш код
        Astronaut astronaut1 = new Human();
        Astronaut astronaut2 = new Human();
        Astronaut cat = new Cat();
        Astronaut dog = new Dog();
        astronauts.add(astronaut1);
        astronauts.add(astronaut2);
        astronauts.add(cat);
        astronauts.add(dog);
    }

    public static void printCrewInfo() {
        System.out.println("На борт погружены члены экипажа: ");
        for (Astronaut astronaut : astronauts) {
            System.out.println(astronaut.getInfo());
        }
    }
}
