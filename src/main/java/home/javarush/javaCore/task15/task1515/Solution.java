package home.javarush.javaCore.task15.task1515;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Статики-2
*/

public class Solution {
    public static int A;
    public static int B;


    static {
        Scanner scanner = new Scanner(System.in);
        try {
            int a = scanner.nextInt();
            scanner.nextLine();
            A = a;
            int b = scanner.nextInt();
            B = b;
        }catch (Exception ex){
            System.out.println(ex.getMessage());
        }finally {
            scanner.close();
        }
    }
    public static final int MIN = min(A, B);

    public static void main(String[] args) {
        System.out.println(MIN);
    }

    public static int min(int a, int b) {
        return a < b ? a : b;
    }
}
