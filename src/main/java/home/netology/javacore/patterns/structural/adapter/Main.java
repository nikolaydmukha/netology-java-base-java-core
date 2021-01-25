package home.netology.javacore.patterns.structural.adapter;

public class Main {
    public static void main(String[] args) {
        Ints calc = new IntsCalculator();
        System.out.println(calc.sum(10,10));
    }
}
