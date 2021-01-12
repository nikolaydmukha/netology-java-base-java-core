package main.java.home.javarush.javaSyntax.task12.task1206;

/*
Реализуй методы countDigits(String), countLetters(String), countSpaces(String), которые должны возвращать количество
цифр, букв и пробелов в строке.
Метод main не принимает участия в проверке.
*/
public class Solution {
    public static void main(String[] args) {
        String string = "Думаю, это будет новой фичей.";


        System.out.println("Количество цифр в строке : " + countDigits(string));
        System.out.println("Количество букв в строке : " + countLetters(string));
        System.out.println("Количество пробелов в строке : " + countSpaces(string));
    }

    public static int countDigits(String string) {
        //напишите тут ваш код
        int counter = 0;
        for(int i = 0; i < string.length(); i++) {
            if (Character.isDigit(string.charAt(i))) {
                counter ++;
            }
        }
        return counter;
    }

    public static int countLetters(String string) {
        //напишите тут ваш код
        int counter = 0;
        for(int i = 0; i < string.length(); i++) {
            if (Character.isAlphabetic(string.charAt(i))) {
                counter ++;
            }
        }
        return counter;
    }

    public static int countSpaces(String string) {
        //напишите тут ваш код
        int counter = 0;
        for(int i = 0; i < string.length(); i++) {
            if (Character.isSpaceChar(string.charAt(i))) {
                counter ++;
            }
        }
        return counter;
    }

}
