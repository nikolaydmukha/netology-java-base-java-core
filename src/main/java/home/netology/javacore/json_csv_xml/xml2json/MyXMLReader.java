package home.netology.javacore.json_csv_xml.xml2json;

import home.netology.javacore.json_csv_xml.csv2json.Employee;
import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class MyXMLReader {
    private File file;

    public MyXMLReader(File path) {
        this.file = path;
    }

    public String getFile() {
        return file.getPath();
    }

    public ArrayList<Employee> parseXML() throws IOException {
        ArrayList<Employee> employees = new ArrayList<>();

        try {
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(file);
            doc.getDocumentElement().normalize();
            NodeList nList = doc.getElementsByTagName("employee");

            for (int temp = 0; temp < nList.getLength(); temp++) {
                Node nNode = nList.item(temp);

                if (nNode.getNodeType() == Node.ELEMENT_NODE) {
                    Element eElement = (Element) nNode;
                    int id = Integer.parseInt(eElement
                            .getElementsByTagName("id")
                            .item(0)
                            .getTextContent());
                    String firstname = eElement
                            .getElementsByTagName("firstName")
                            .item(0)
                            .getTextContent();
                    String lastname = eElement
                            .getElementsByTagName("lastName")
                            .item(0)
                            .getTextContent();
                    String country = eElement
                            .getElementsByTagName("country")
                            .item(0)
                            .getTextContent();
                    byte age = Byte.parseByte(eElement
                            .getElementsByTagName("age")
                            .item(0)
                            .getTextContent());
                    employees.add(new Employee(id, firstname, lastname, country, age));
                }
            }
        } catch (
                Exception e) {
            e.printStackTrace();
        }
        return employees;
    }

}
