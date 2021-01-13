package main.java.home.netology.javacore.lambda.calc;

import java.util.function.*;

public class Calculator {

    static Supplier<Calculator> instance = Calculator::new;

    public Calculator() {
    }

    BinaryOperator<Integer> plus = (x, y) -> x + y;
    BinaryOperator<Integer> minus = (x, y) -> x - y;
    BinaryOperator<Integer> multiply = (x, y) -> x * y;
    BinaryOperator<Integer> divide = (x, y) -> {
        if (y != 0) {
           return x / y;
        }else {
            throw new ArithmeticException("Devision by zero!");
        }
    };

    UnaryOperator<Integer> pow = x -> x * x;
    UnaryOperator<Integer> abs = x -> x > 0 ? x : x * -1;

    Predicate<Integer> isPositive = x -> x > 0;

    Consumer<Integer> println = System.out::println;
    Consumer<Boolean> printlnBoolean = System.out::println;
}
