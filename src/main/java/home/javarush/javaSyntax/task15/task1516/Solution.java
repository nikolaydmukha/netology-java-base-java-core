package home.javarush.javaSyntax.task15.task1516;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

/* 
Файл или директория
*/

public class Solution {
    private static final String THIS_IS_FILE = " - это файл";
    private static final String THIS_IS_DIR = " - это директория";

    public static void main(String[] args) {
        //напишите тут ваш код
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String input = scanner.nextLine();
            if (Files.isDirectory(Path.of(input))) {
                System.out.printf("%s %s\n", input, THIS_IS_DIR);
            } else if (Files.isRegularFile(Path.of(input))) {
                System.out.printf("%s %s\n", input, THIS_IS_FILE);
            }
            else {
                break;
            }
        }
    }
}

