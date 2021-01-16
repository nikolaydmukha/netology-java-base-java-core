package home.javarush.javaSyntax.task15.task1507;

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

        try (Scanner scanner = new Scanner(System.in);){
            String src = scanner.nextLine();
            List<String> inputStream = Files.readAllLines(Paths.get(src));
            for(int i = 0; i < inputStream.size(); i += 2){
                System.out.println(inputStream.get(i));
            }
        } catch (IOException exception) {
            System.out.println(exception.getCause());
        }
    }
}

