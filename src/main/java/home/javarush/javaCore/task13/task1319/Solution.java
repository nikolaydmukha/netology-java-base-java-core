package main.java.home.javarush.javaCore.task13.task1319;

import java.awt.image.AreaAveragingScaleFilter;
import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/* 
Писатель в файл с консоли
*/

public class Solution {
    public static void main(String[] args) {
        // напишите тут ваш код
        Scanner scanner = new Scanner(System.in);
//        System.out.println("Введите имя файла: ");
        String path = scanner.nextLine();
        ArrayList<String> usersInput = new ArrayList<>(10);
        while(true){
//            System.out.println("Введите строку для записи в файл: ");
            String lineToWrite = scanner.nextLine();
            if (lineToWrite.equalsIgnoreCase("exit")){
                usersInput.add(lineToWrite);
                break;
            }
            usersInput.add(lineToWrite);
        }

        try (
                BufferedWriter br = new BufferedWriter(new FileWriter(path));
        ) {
            usersInput.stream().forEach(item -> {
                try {
                    br.write(item + System.getProperty("line.separator"));
                } catch (IOException exception) {
                    exception.printStackTrace();
                }
            });

        } catch (FileNotFoundException exception) {
            exception.printStackTrace();
        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }
}
