package home.javarush.javaSyntax.task15.task1518;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

/* 
А что же внутри папки?
*/

public class Solution {

    private static final String THIS_IS_FILE = " - это файл";
    private static final String THIS_IS_DIR = " - это директория";

    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        Scanner scanner = new Scanner((System.in));
        Path path = Path.of(scanner.nextLine());
        try (DirectoryStream<Path> directoryStream = Files.newDirectoryStream(path);) {
            for(Path item : directoryStream){
                if (Files.isDirectory(item)) {
                    System.out.printf("%s%s\n", item, THIS_IS_DIR);
                } else if (Files.isRegularFile(item)) {
                    System.out.printf("%s%s\n", item, THIS_IS_FILE);
                }
            }
        }
    }
}

