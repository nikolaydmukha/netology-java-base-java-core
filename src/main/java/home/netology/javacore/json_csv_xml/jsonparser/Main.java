package home.netology.javacore.json_csv_xml.jsonparser;

import java.io.File;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        JSONParser jsonParser = new JSONParser(getPathFile());
        jsonParser.parseToEmployee();
    }

    private static File getPathFile() {
        System.out.println("Введите путь к JSON файлу: ");
        Scanner scanner = new Scanner(System.in);
        String path = scanner.nextLine();
        return new File(path);
    }
}
