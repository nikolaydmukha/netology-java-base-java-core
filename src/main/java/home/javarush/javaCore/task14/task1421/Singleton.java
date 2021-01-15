package main.java.home.javarush.javaCore.task14.task1421;

import java.text.SimpleDateFormat;

public class Singleton {
    private static int count = 0;
    private static Singleton instance = new Singleton();

    private Singleton() {
        count++;
    }

    public static int getCount() {
        return count;
    }

    public static Singleton getInstance() {
        return instance;
    }
}
