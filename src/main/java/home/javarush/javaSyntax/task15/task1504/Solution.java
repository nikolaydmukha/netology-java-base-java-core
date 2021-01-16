package home.javarush.javaSyntax.task15.task1504;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

/*
Перепутанные байты
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите источник: ");
        String src = scanner.nextLine();

        System.out.println("Введите файл назначения: ");
        String dst = scanner.nextLine();

        try {
            InputStream inputStream = Files.newInputStream(Paths.get(src));
            OutputStream outputStream = Files.newOutputStream(Paths.get(dst));
            ArrayList<Integer> arr = new ArrayList<>();
            int data = inputStream.read();
            while (data != -1) {
                arr.add(data);
                data = inputStream.read();
            }
            if (arr.size() / 2 == 0) {
                for (int i = 0; i < arr.size(); i += 2) {
                    int tmp = arr.get(i);
                    arr.set(i, arr.get(i + 1));
                    arr.set(i + 1, tmp);
                }
            } else {
                for (int i = 0; i < arr.size() - 1; i += 2) {
                    int tmp = arr.get(i);
                    arr.set(i, arr.get(i + 1));
                    arr.set(i + 1, tmp);
                }
            }
            for (int i = 0; i < arr.size(); i++) {
                outputStream.write(arr.get(i));
            }
            inputStream.close();
            outputStream.close();
        } catch (IOException exception) {
            System.out.println(exception.getCause());
        }
    }
}

