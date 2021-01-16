package home.javarush.javaCore.task13.task1326;

import java.awt.image.AreaAveragingScaleFilter;
import java.io.*;
import java.util.*;

/* 
Сортировка четных чисел из файла
*/

public class Solution {
    public static void main(String[] args) {
        // напишите тут ваш код
        Scanner scanner = new Scanner(System.in);
//        System.out.println("Введите имя файла: ");
        String path = scanner.nextLine();
        try (BufferedInputStream inputStream = new BufferedInputStream(new FileInputStream(path));
             BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
        ) {
            ArrayList<Integer> digitsArr = new ArrayList<>();
            while (reader.ready()) {
                String line = reader.readLine();
                digitsArr.add(Integer.valueOf(line));
            }
            Collections.sort(digitsArr);
            digitsArr.stream().filter(item -> item % 2 == 0).forEach(item -> System.out.println(item));

        } catch (FileNotFoundException exception) {
            exception.printStackTrace();
        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }
}
