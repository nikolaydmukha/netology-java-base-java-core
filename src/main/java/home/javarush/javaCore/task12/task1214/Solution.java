package main.java.home.javarush.javaCore.task12.task1214;

/* 
Корова — тоже животное
*/

public class Solution {
    public static void main(String[] args) {

    }

    public static abstract class Animal {
        public abstract String getName();
    }

    public static class Cow  extends Animal{
        @Override
        public String getName() {
            return "Бурка";
        }
    }

}