package home.netology.javacore.junit.test;

import home.netology.javacore.junit.jsonparser.Employee;
import home.netology.javacore.junit.jsonparser.EmployeeComparator;
import home.netology.javacore.junit.jsonparser.JSONParser;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import static org.hamcrest.io.FileMatchers.anExistingFile;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class JSONParserTest {

    DateTimeFormatter f = DateTimeFormatter.ofPattern("HH:mm:ss dd.mm.yyyy");

    @BeforeEach
    public void beforeAll() {

        System.out.println("Starting test " + LocalDateTime.now().format(f));
    }

    @AfterEach
    public void afterEach() {
        System.out.println("Ending test " + LocalDateTime.now().format(f));
    }

    File file = new File("src/main/java/home/netology/javacore/junit/test/docs/data.json");
    JSONParser jsonParser = new JSONParser(file);

    @Test
    public void existFileTest() {
        assertTrue(file.exists());
    }

    @Test
    public void existEmployeesListTest() {
        ArrayList<Employee> employees = jsonParser.parseToEmployee();

        assertEquals(2, employees.size());
    }

    @Test
    public void parseJSONToEmployeeTest() {
        EmployeeComparator employeeComparator = new EmployeeComparator();
        ArrayList<Employee> employees = jsonParser.parseToEmployee();
        Employee employee1 = new Employee(1, "John", "Smith", "USA", (byte) 25);

        assertEquals(0, employeeComparator.compare(employee1, employees.get(0)));
    }

    //Hamcrest
    @Test
    public void hamcrestExistFileTest() {
        assertThat(file, anExistingFile());
    }

    @Test
    public void hamcrestExistEmployeesListTest() {
        ArrayList<Employee> employees = jsonParser.parseToEmployee();
        assertThat(employees, hasSize(3));

    }

    @Test
    public void hamcrestParseJSONToEmployeeTest() {
        EmployeeComparator employeeComparator = new EmployeeComparator();
        List<Employee> employees = jsonParser.parseToEmployee();
        Employee employee1 = new Employee(1, "John", "Smith", "USA", (byte) 25);

        assertThat(employee1.getFirstname().concat(employee1.getLastname()).hashCode(),
                is(employees.get(0).getFirstname().concat(employees.get(0).getLastname()).hashCode()));
    }
}
