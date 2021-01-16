package home.javarush.javaSyntax.task15.task1506;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

/* 
Пропускаем не всех
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Scanner scanner = new Scanner(System.in);
//        System.out.println("Введите источник: ");
        String src = scanner.nextLine();
        try {
            List<String> inputStream = Files.readAllLines(Paths.get(src));
            for(String str : inputStream) {
                System.out.println(str.replace(" ","").replace(".", "").replace(",", ""));
            }
        } catch (IOException exception) {
            System.out.println(exception.getCause());
        }
    }
}


