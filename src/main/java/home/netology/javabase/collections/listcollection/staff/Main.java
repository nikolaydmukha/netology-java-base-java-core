package home.netology.javabase.collections.listcollection.staff;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    static List<Employee> employees = new ArrayList<>();
    static String[] employeeFeatures = new String[]{
            "Имя",
            "Фамилия",
            "Возраст",
            "Пол",
            "Образование",
            "Должность",
            "Отдел"
    };

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        fillEmployee(employeeFeatures, scanner);
        showEmployee();
        changeEmployee(scanner);

    }

    static void fillEmployee(String[] employeeFeatures, Scanner scanner) {
        String feature = "start";
        while (!feature.equals("стоп")) {
            List<String> features = new ArrayList<>();
            for (int i = 0; i < employeeFeatures.length; i++) {
                System.out.println("Введите " + employeeFeatures[i].toLowerCase() + ":");
                feature = scanner.nextLine();
                if (feature.equals("стоп")) {
                    break;
                }
                if (employeeFeatures[i].equalsIgnoreCase("возраст")) {
                    try {
                        byte age = Byte.parseByte(feature);
                        if (age > 65 && age <= 18) {
                            throw new InvalidAgeException("Введён некорректный возраст.");
                        }
                    } catch (NumberFormatException ex) {
                        i--;
                        System.out.println("Вы ввели не число. Повторите ввод.");
                    } catch (InvalidAgeException ex) {
                        i--;
                        System.out.println(ex.getMessage());
                    }
                }
                if (!feature.equals("стоп")) {
                    features.add(feature);
                }
            }
            if (!feature.equals("стоп")) {
                addEmployee(features);
            }
        }
    }

    static void addEmployee(List<String> features) {
        EmployeeBuilder employeeBuilder = new EmployeeBuilder();

        employees.add(employeeBuilder.withName(features.get(0))
                .withSurname(features.get(1))
                .withAge(Byte.parseByte(features.get(2)))
                .withGender(features.get(3))
                .withEducation(features.get(4))
                .withPosition(features.get(5))
                .withDepartment(features.get(6)).build()
        );
    }

    static void showEmployee() {
        // Print the list objects in tabular format.
        String ex[] = {"NAME", "LAST NAME", "AGE", "GENDER", "EDUCATION", "POSITION", "DEPARTMENT"};
        String format = "|%1$-10s|%2$-20s|%3$-5s|%3$-5s|%4$-20s|%5$-20s|%6$-20s|%7$-20s|\n";
        System.out.format(String.format(format, (Object[]) ex));
        System.out.println("___________________________________________________________" +
                "______________________________________________________________________");
        for (Employee employee : employees) {
            System.out.format(String.format(format, (Object[]) new String[]{employee.getName(), employee.getLastName(), String.valueOf(employee.getAge()), employee.getGender(), employee.getEducation(),
                    employee.getPosition(), employee.getDepartment()}));
        }
    }

    static void changeEmployee(Scanner scanner) {
        System.out.println("Если вы хотите изменить данные какого-либо работника, введите фамилию и имя работника, " +
                "для которого хотите изменить данные. Или введите 'стоп' для завершения.");
        while (true) {
            String name = scanner.next();
            if ("стоп".equals(name)) {
                break;
            }
            String lastName = scanner.next();
            if ("стоп".equals(name)) {
                break;
            }
            int empIndex = searchBySurname(lastName, name);
            scanner.nextLine();
            if (empIndex != -1) {
                for (String feature : employeeFeatures) {
                    System.out.println("Меняем " + feature.toLowerCase() + "?");
                    String isChange = scanner.nextLine();
                    if ("да".equalsIgnoreCase(isChange)) {
                        System.out.println("Введите " + feature.toLowerCase());
                        String newFeatureValue = scanner.nextLine();
                        setNewEmployeeFeature(empIndex, newFeatureValue, feature);
                        continue;
                    }
                }
                showEmployee();
            }
        }
    }

    static int searchBySurname(String lastName, String name) {
        for (Employee employee : employees) {
            if (lastName.equals(employee.getLastName()) && name.equals(employee.getName())) {
                return employees.indexOf(employee);
            }
        }
        return -1;
    }

    static void setNewEmployeeFeature(int empIndex, String newFeatureValue, String feature) {
        switch (feature.toLowerCase()) {
            case "имя":
                employees.get(empIndex).setName(newFeatureValue);
                break;
            case "фамилия":
                employees.get(empIndex).setLastName(newFeatureValue);
                break;
            case "возраст":
                employees.get(empIndex).setAge(Byte.parseByte(newFeatureValue));
                break;
            case "пол":
                employees.get(empIndex).setGender(newFeatureValue);
                break;
            case "образование":
                employees.get(empIndex).setEducation(newFeatureValue);
                break;
            case "должность":
                employees.get(empIndex).setPosition(newFeatureValue);
                break;
            case "отдел":
                employees.get(empIndex).setDepartment(newFeatureValue);
                break;
        }
    }
}
