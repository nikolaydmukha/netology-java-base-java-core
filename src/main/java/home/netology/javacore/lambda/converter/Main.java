package main.java.home.netology.javacore.lambda.converter;

public class Main {
    public static void main(String[] args) {
        MathActions mathActions = MathActions.instance.get();

        mathActions.incrementInfo.accept(1);
        mathActions.decrementInfo.accept(1);
        mathActions.powerInfo.accept(5);
        System.out.println(mathActions.toString.apply(13));


    }
}
