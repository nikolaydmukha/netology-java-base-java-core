package main.java.home.javarush.javaSyntax.task15.task1520;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

/* 
Глубокое копирование
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        Path sourceDirectory = Path.of(scanner.nextLine());
        Path targetDirectory = Path.of(scanner.nextLine());

        Files.walk(sourceDirectory).forEach(path -> {
            try {
                Files.copy(path, targetDirectory.resolve(sourceDirectory.relativize(path)));
            } catch (IOException e) {
                e.printStackTrace();
            }
        });
    }
}

