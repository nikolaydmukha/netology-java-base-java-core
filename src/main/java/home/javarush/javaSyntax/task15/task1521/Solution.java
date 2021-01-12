package main.java.home.javarush.javaSyntax.task15.task1521;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

/* 
Временное сохранение файла
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        Scanner scanner = new Scanner(System.in);
//        String image = "https://www.google.com/images/branding/googlelogo/1x/googlelogo_color_272x92dp.png";
        String image = scanner.nextLine();
        URL url = new URL(image);
        InputStream input = url.openStream();

        Path path = Path.of("C:\\Users\\n.dmukha\\Desktop\\Work\\Omilia\\JavaModules\\MyModules\\JavaRushTasks\\1.JavaSyntax\\src\\com\\javarush\\task\\pro\\task15\\task1521");
        Path downloadedImage = Files.createTempFile(null, null);
        Files.write(downloadedImage, input.readAllBytes());
    }
}