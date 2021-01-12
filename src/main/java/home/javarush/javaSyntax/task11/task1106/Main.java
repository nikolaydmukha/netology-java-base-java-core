package main.java.home.javarush.javaSyntax.task11.task1106;

public class Main {
    public static void main(String[] args) {
        Car mersedes = new Car();
        Car bmw = new Car();
        mersedes.setModelName("Mercedes-Benz C coupe");
        bmw.setModelName("BMW 3 series");

        System.out.println(mersedes.getModelName());
    }
}
