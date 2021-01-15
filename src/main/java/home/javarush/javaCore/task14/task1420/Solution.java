package main.java.home.javarush.javaCore.task14.task1420;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/* 
НОД
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

//        System.out.println("Введите первое число: ");
        String first = scanner.nextLine();

//        System.out.println("Введите второе число: ");
        String second = scanner.nextLine();
        ArrayList<Integer> delimitersFirst;
        ArrayList<Integer> delimitersSecond;
        try {
            int number1 = validateNumber(Integer.valueOf(first));
            int number2 = validateNumber(Integer.valueOf(second));

            delimitersFirst = findDelimiters(number1);
            delimitersSecond = findDelimiters(number2);

            Collections.sort(delimitersFirst);
            Collections.sort(delimitersSecond);

            for (int i = delimitersFirst.size() - 1; i >= 0; i--) {
                if (delimitersSecond.contains(delimitersFirst.get(i))) {
                    System.out.println(delimitersFirst.get(i));
                    break;
                }
            }

        } finally {

        }
    }

    static ArrayList<Integer> findDelimiters(int number) {
        ArrayList<Integer> delimiters = new ArrayList<>();

        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                delimiters.add(i);
            }
        }
        return delimiters;
    }

    static int validateNumber(int number) throws IllegalArgumentException {
        if (number < 1)
            throw new IllegalArgumentException();
        return number;

    }
}
