package home.javarush.javaSyntax.task12.task1205;

/*
Реализуй метод divide(double a, double b) так, чтобы в консоли выводился результат деления числа a на число b.
Должно выводиться следующее значение:
    Double.POSITIVE_INFINITY, если верен любой из следующих пунктов:
        a положительное и b равно 0;
        a равно Double.POSITIVE_INFINITY и b >= 0;
        a равно Double.NEGATIVE_INFINITY и b < 0;
    Double.NEGATIVE_INFINITY, если верен любой из следующих пунктов:
        a отрицательное и b равно 0;
        a равно Double.NEGATIVE_INFINITY и b >= 0;
        a равно Double.POSITIVE_INFINITY и b < 0;
    Double.NaN, если верен любой из следующих пунктов:
        a равно 0 и b равно 0;
        хотя бы один из операндов равен Double.NaN;
        a равно Double.POSITIVE_INFINITY и b равно Double.POSITIVE_INFINITY;
        a равно Double.POSITIVE_INFINITY и b равно Double.NEGATIVE_INFINITY;
        a равно Double.NEGATIVE_INFINITY и b равно Double.POSITIVE_INFINITY;
        a равно Double.NEGATIVE_INFINITY и b равно Double.NEGATIVE_INFINITY;
    Иначе выводить результат деления a на b.

Требования:
    Метод divide(double a, double b) должен выводить в консоли результат деления числа a на число b.
    Метод divide(double a, double b) должен выводить в консоли "Infinity" согласно пункту 1 условия.
    Метод divide(double a, double b) должен выводить в консоли "-Infinity"согласно пункту 2 условия.
    Метод divide(double a, double b) должен выводить в консоли "NaN" согласно пункту 3 условия.
* */
public class Solution {

    public static void main(String[] args) {
        divide(1, 0);
        divide(-1, 0);
        divide(0, 0);
        divide(100, 20);
        divide(200, 20);
        divide(Double.POSITIVE_INFINITY, Double.NEGATIVE_INFINITY);
    }

    public static void divide(double a, double b) {
        //напишите тут ваш код
        if ((a > 0 && b == 0) ||
                (Double.isInfinite(a) && a == Double.POSITIVE_INFINITY  && b >= 0 && !Double.isInfinite(b)) ||
                (Double.isInfinite(a) && a == Double.NEGATIVE_INFINITY && b < 0) && !Double.isInfinite(b)) {
            System.out.println(Double.POSITIVE_INFINITY);
        } else if ((a < 0 && b == 0) ||
                (Double.isInfinite(a) && a == Double.NEGATIVE_INFINITY   && b >= 0) && !Double.isInfinite(b) ||
                (Double.isInfinite(a) && a == Double.POSITIVE_INFINITY && b < 0) && !Double.isInfinite(b)) {
            System.out.println(Double.NEGATIVE_INFINITY);
        } else if ((a == 0 && b == 0) || (Double.isNaN(a) || Double.isNaN(b)) ||
                (Double.isInfinite(a) && a == Double.POSITIVE_INFINITY && Double.isInfinite(b) && b == Double.POSITIVE_INFINITY) ||
                (Double.isInfinite(a) && a == Double.POSITIVE_INFINITY && Double.isInfinite(b) && b == Double.NEGATIVE_INFINITY) ||
                (Double.isInfinite(a) && a == Double.NEGATIVE_INFINITY && Double.isInfinite(b) && b == Double.POSITIVE_INFINITY) ||
                (Double.isInfinite(a) && a == Double.NEGATIVE_INFINITY && Double.isInfinite(b) && b == Double.NEGATIVE_INFINITY)) {
            System.out.println(Double.NaN);
        } else {
            System.out.println(a / b);
        }
    }
}