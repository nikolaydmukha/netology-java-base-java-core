package main.java.home.hackerrank.endoffile;

import java.util.Scanner;

public class JavaEndOfFile {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int count = 1;

        while(s.hasNext()) {
            String ns = s.nextLine();
            System.out.println(count + " " + ns);
            count++;
        }
    }

}
