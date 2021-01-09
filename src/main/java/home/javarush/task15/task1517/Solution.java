package main.java.home.javarush.task15.task1517;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

/* 
Файловые операции
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первый путь к файлу: ");
        String path1 = scanner.nextLine();
        System.out.println("Введите второй путь к файлу: ");
        String path2 = scanner.nextLine();

        if (!Files.exists(Path.of(path1))) {
            Files.createFile(Path.of(path1));
        } else if (!Files.exists(Path.of(path2))) {
            Files.move((Path.of(path1)), (Path.of(path2)));
        } else {
            Files.delete(Path.of(path1));
        }

    }
}

