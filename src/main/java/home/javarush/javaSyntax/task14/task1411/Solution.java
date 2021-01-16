package home.javarush.javaSyntax.task14.task1411;

import java.io.FileNotFoundException;
import java.nio.file.FileSystemException;

public class Solution {

    public static final String FAILED_TO_READ = "Не удалось прочесть файл.";
    public static final String FAILED_TO_WRITE = "Не удалось записать в файл.";

    public static home.javarush.ask14.task1411.FileManager fileManager = new home.javarush.ask14.task1411.FileManager();

    public static void main(String[] args) {
        try {
            fileManager.copyFile("book.txt", "book_final_copy.txt");
            fileManager.copyFile("book_final_copy.txt", "book_last_copy.txt");
        } catch (RuntimeException ex) {
            Throwable cause = ex.getCause();
            if (cause instanceof FileNotFoundException) {
                System.out.println(FAILED_TO_READ);
            } else if (cause instanceof FileSystemException) {
                System.out.println(FAILED_TO_WRITE);
            }
        }
    }
}
