package home.netology.javacore.json_csv_xml.csv2json;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        File csvFile = getPathFile();
        File jsonFilePath = prepareFileToJSON(csvFile);
        ArrayList<Employee> employees;

        MyCSVReader myCSVReader = new MyCSVReader(csvFile);
        ToJSONConverter toJSONConverter = new ToJSONConverter(jsonFilePath);

        try {
            employees = myCSVReader.parseCSV();
            toJSONConverter.writeToJSONFile(employees);

        }catch (IOException ex){
            System.err.println(ex.getMessage());
        }

    }

    private static File getPathFile() {
        System.out.println("Введите путь к  CSV файлу: ");
        Scanner scanner = new Scanner(System.in);
        String path = scanner.nextLine();
        return new File(path);
    }

    private static File prepareFileToJSON(File file){
        return new File(file.getParent() + "\\" + file.getName().replaceAll("csv", "json"));

    }
}
