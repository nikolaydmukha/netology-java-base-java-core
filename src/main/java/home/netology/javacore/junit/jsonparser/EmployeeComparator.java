package home.netology.javacore.junit.jsonparser;

import java.util.Comparator;

public class EmployeeComparator implements Comparator<Employee> {

    @Override
    public int compare(Employee o1, Employee o2) {
        return o1.getFirstname().concat(o1.getLastname()).compareTo(o2.getFirstname().concat(o2.getLastname()));

    }

}
