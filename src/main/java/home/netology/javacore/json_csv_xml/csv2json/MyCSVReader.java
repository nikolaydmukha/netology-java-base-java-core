package home.netology.javacore.json_csv_xml.csv2json;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class MyCSVReader {
    private File file;

    public MyCSVReader(File path) {
        this.file = path;
    }

    public String getFile() {
        return file.getPath();
    }

    public ArrayList<Employee> parseCSV() throws IOException {
        ArrayList<Employee> employees = new ArrayList<>();

        try (FileInputStream fis = new FileInputStream(file);) {
            CSVParser parser = CSVFormat.DEFAULT.parse(new InputStreamReader(fis));
            for (CSVRecord csvRecord : parser) {
                int id = Integer.parseInt(csvRecord.get(0));
                String firstname = csvRecord.get(1);
                String lastname = csvRecord.get(2);
                String country = csvRecord.get(3);
                byte age = Byte.parseByte(csvRecord.get(4));
                employees.add(new Employee(id, firstname, lastname, country, age));
            }
        }
        return employees;
    }

}
