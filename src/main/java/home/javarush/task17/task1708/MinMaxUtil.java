package main.java.home.javarush.task17.task1708;

/* 
Минимальное и максимальное
*/

public class MinMaxUtil {
    //напишите тут ваш код
    public static int min(int a, int b) {
        return Math.min(a, b);
    }

    public static int min(int a, int b, int c) {
        return min(c, min(a, b));
    }

    public static int min(int a, int b, int c, int d) {
        return min(min(c, d), min(a, b));
    }

    public static int min(int a, int b, int c, int d, int e) {
        return min(e, min(min(c, d), min(a, b)));
    }

    public static int max(int a, int b) {
        return Math.max(a, b);
    }

    public static int max(int a, int b, int c) {
        return max(c, max(a, b));
    }

    public static int max(int a, int b, int c, int d) {
        return max(max(c, d), max(a, b));
    }

    public static int max(int a, int b, int c, int d, int e) {
        return max(e, max(max(c, d), max(a, b)));
    }

}
