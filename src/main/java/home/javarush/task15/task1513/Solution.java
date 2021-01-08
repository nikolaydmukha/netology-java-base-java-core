package main.java.home.javarush.task15.task1513;

import java.io.FileNotFoundException;
import java.nio.file.Path;
import java.util.Scanner;

/* 
Зри в корень
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        try(Scanner scanner = new Scanner(System.in);){
            String fileName = scanner.nextLine();
            Path path = Path.of(fileName).getRoot();
            System.out.println(path);
        }
    }
}

