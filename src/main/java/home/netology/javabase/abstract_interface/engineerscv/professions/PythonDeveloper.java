package home.netology.javabase.abstract_interface.engineerscv.professions;

import home.netology.javabase.abstract_interface.engineerscv.Engineer;
import home.netology.javabase.abstract_interface.engineerscv.skills.IDB;
import home.netology.javabase.abstract_interface.engineerscv.skills.ITCPIP;

public class PythonDeveloper extends Engineer implements IDB, ITCPIP {
    public PythonDeveloper(String name, int age, String country) {
        super(name, age, country);
    }

    @Override
    public void connectDB() {
        System.out.println("Learn connect type from Python");
    }

    @Override
    public void learnSpecialDB() {
        System.out.println("Lear MySQL, Postgres, Oracle");
    }

    @Override
    public void learnSQLSyntax() {
        System.out.println("Learn syntax of MySQL, Postgres, Oracle");
    }
}
