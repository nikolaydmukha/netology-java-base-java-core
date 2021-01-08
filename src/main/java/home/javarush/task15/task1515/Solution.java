package main.java.home.javarush.task15.task1515;

import org.w3c.dom.ls.LSOutput;

import java.nio.file.Path;
import java.util.Scanner;

/* 
Абсолютный путь
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Scanner scanner = new Scanner(System.in);
        String fileName = scanner.nextLine();
        Path path = Path.of(fileName);
        if (path.isAbsolute()) {
            System.out.println(path);
        } else {
            System.out.println(path.toAbsolutePath());
        }
    }
}

