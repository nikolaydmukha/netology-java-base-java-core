package main.java.home.javarush.javaSyntax.task11.task1108;

/*
Давай проведем рефакторинг кода: вынесем отдельно утильные методы.
Для этого создай внутренний статический (вложенный) класс Calculator и перенеси в него методы add, subtract, multiply и divide.
Не забудь подкорректировать их вызовы.
Требования:
    В классе Solution нужно создать вложенный (static nested) класс Calculator.
    Методы add, subtract, multiply и divide нужно перенести в класс Calculator.
    В методе main должны быть вызваны методы add, subtract, multiply и divide класса Calculator.
 */
public class Solution {
    public static final String EQUAL = " = ";

    static Calculator calculator = new Calculator();

    public static void main(String[] args) {
        int a = 45;
        int b = 15;
        calculator.add(a, b);
        calculator.subtract(a, b);
        calculator.multiply(a, b);
        calculator.divide(a, b);
    }

    static class Calculator {
        public static void add(int a, int b) {
            System.out.println(a + " + " + b + EQUAL + (a + b));
        }

        public static void subtract(int a, int b) {
            System.out.println(a + " - " + b + EQUAL + (a - b));
        }

        public static void multiply(int a, int b) {
            System.out.println(a + " * " + b + EQUAL + (a * b));
        }

        public static void divide(int a, int b) {
            System.out.println(a + " / " + b + EQUAL + (a / b));
        }
    }


}
