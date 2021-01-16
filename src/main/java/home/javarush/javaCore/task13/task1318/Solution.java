package home.javarush.javaCore.task13.task1318;

import java.io.*;
import java.util.Scanner;

/* 
Чтение файла
*/

public class Solution {
    public static void main(String[] args) {
        // напишите тут ваш код
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите имя файла: ");
        String path = scanner.nextLine();
        try (BufferedInputStream inputStream = new BufferedInputStream(new FileInputStream(path));
             BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
        ) {
            while (reader.ready()) {
                String line = reader.readLine();
                System.out.println(line);
            }
        } catch (FileNotFoundException exception) {
            exception.printStackTrace();
        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }
}