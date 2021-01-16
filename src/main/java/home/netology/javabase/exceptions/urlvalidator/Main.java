package home.netology.javabase.exceptions.urlvalidator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Введите URL");
            String url = scanner.nextLine();
            UrlUtils.validate(url);
            System.out.print("Введенный url корректен");
        } catch (Exception e) {
            System.out.print("Введенный url некорректен");
        }
    }
}
