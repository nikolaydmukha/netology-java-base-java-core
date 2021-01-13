package main.java.home.netology.javacore.lambda.calc;

public class Main {
    public static void main(String[] args) {

        Calculator calc = Calculator.instance.get();
        int a = calc.plus.apply(1, 2);
        int b = calc.minus.apply(1, 1);
        int c = calc.divide.apply(a, a + b);
        calc.printlnBoolean.accept(calc.isPositive.test(6));

        calc.println.accept(c);
    }
}
