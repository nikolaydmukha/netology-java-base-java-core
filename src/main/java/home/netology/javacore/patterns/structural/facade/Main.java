package home.netology.javacore.patterns.structural.facade;

public class Main {
    public static void main(String[] args) {
        BinOps bins = new BinOps();
        System.out.println(bins.sum("1111", "10101"));
    }
}
