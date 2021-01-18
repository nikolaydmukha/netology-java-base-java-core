package home.netology.javacore.json_csv_xml.xml2json;

import home.netology.javacore.json_csv_xml.csv2json.Employee;
import home.netology.javacore.json_csv_xml.csv2json.ToJSONConverter;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        File xmlFile = getPathFile();
        File jsonFilePath = prepareFileToJSON(xmlFile);
        ArrayList<Employee> employees;

        MyXMLReader myXMLReader = new MyXMLReader(xmlFile);
        ToJSONConverter toJSONConverter = new ToJSONConverter(jsonFilePath);

        try {
            employees = myXMLReader.parseXML();
            toJSONConverter.writeToJSONFile(employees);

        }catch (IOException ex){
            System.err.println(ex.getMessage());
        }

    }

    private static File getPathFile() {
        System.out.println("Введите путь к XML файлу: ");
        Scanner scanner = new Scanner(System.in);
        String path = scanner.nextLine();
        return new File(path);
    }

    private static File prepareFileToJSON(File file){
        return new File(file.getParent() + "\\" + file.getName().replaceAll("xml", "json"));

    }
}
