package home.netology.javacore.json_csv_xml.csv2json;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class ToJSONConverter {

    private File dst;

    public ToJSONConverter(File dst) {
        this.dst = dst;
    }

    public void writeToJSONFile(ArrayList<Employee> employees) throws IOException {

        Gson gson = new GsonBuilder().setPrettyPrinting().create();

        try (FileWriter writer = new FileWriter(dst)) {
            for (Employee employee : employees){
                gson.toJson(employee, writer);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
