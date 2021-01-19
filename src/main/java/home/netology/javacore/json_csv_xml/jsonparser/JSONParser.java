package home.netology.javacore.json_csv_xml.jsonparser;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;

public class JSONParser {
    private File src;

    public JSONParser(File src) {
        this.src = src;
    }

    public ArrayList<Employee> parseToEmployee() {
        ArrayList<Employee> employees = new ArrayList<>();

        Gson gson = new Gson();
        try (Reader reader = new FileReader(src);) {
            List<Employee> employeesList = gson.fromJson(reader, new TypeToken<List<Employee>>() {}.getType());
            for (Employee employee : employeesList) {
                System.out.println(employee.toString());
            }

        } catch (IOException ex) {
            ex.printStackTrace();
        }

        return employees;
    }
}
