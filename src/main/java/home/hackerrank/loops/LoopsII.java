package main.java.home.hackerrank.loops;

import java.util.Scanner;

public class LoopsII {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        System.out.println("Input data:");
        for (int i = 0; i < t; i++) {
            int a = in.nextInt();
            in.nextLine();
            int b = in.nextInt();
            in.nextLine();
            int n = in.nextInt();
            in.nextLine();
            int sum = 0;
            for (int j = 0; j < n; j++) {
                for (int k = 0; k <= j; k++) {
                    if (k == 0) {
                        sum = a + powerOfTwo(k) * b;
                    } else {
                        sum += powerOfTwo(k) * b;
                    }
                }
                System.out.print(sum + " ");
            }
            System.out.println();
        }
        in.close();
    }

    private static int powerOfTwo(int n) {
        return (int) Math.pow(2, n);
    }
}
