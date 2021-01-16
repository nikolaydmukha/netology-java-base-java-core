package home.netology.javabase.collections.queuecollection.polish_notation;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        LinkedList<String> digits = new LinkedList<>();
        Deque<String> signs = new ArrayDeque<>();

        System.out.println("Введите математический пример:");
        String example = scanner.nextLine();
        for(int i = 0; i < example.length(); i++){
            if (isDigit(String.valueOf(example.charAt(i)))) {
                digits.offer(String.valueOf(example.charAt(i)));
            }else {
                signs.push(String.valueOf(example.charAt(i)));
            }
        }
        while (!digits.isEmpty()) {
            System.out.print(digits.poll());
        }

        while (!signs.isEmpty()) {
            System.out.print(signs.pollFirst());
        }
    }

    private static boolean isDigit(String s) throws NumberFormatException {
        try {
            Integer.parseInt(s);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
