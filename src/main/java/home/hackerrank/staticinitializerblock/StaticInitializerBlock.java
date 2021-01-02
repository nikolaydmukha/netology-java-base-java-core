package main.java.home.hackerrank.staticinitializerblock;

import java.util.Scanner;

public class StaticInitializerBlock {
    static int B;
    static int H;
    static boolean flag;
    static Scanner scanner = new Scanner(System.in);

    static {
        try {
            B = scanner.nextInt();
            scanner.nextLine();
            H = scanner.nextInt();
            if (B <= 0 || H <= 0){
                throw new Exception("Breadth and height must be positive");
            }
            flag = true;
        } catch (Exception ex) {
            //log exception or handle otherwise
            System.out.println(ex.getMessage());
        }
    }

    public static void main(String[] args) {
        if (flag) {
            int area = B * H;
            System.out.print(area);
        }

    }
}
