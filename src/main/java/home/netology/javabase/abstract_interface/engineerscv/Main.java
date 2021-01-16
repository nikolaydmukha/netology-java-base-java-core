package home.netology.javabase.abstract_interface.engineerscv;

import home.netology.javabase.abstract_interface.engineerscv.professions.FrontEndDeveloper;
import home.netology.javabase.abstract_interface.engineerscv.professions.PythonDeveloper;
import home.netology.javabase.abstract_interface.engineerscv.professions.WebDeveloper;

public class Main {
    public static void main(String[] args) {

        FrontEndDeveloper frontEndDeveloper = new FrontEndDeveloper("FrontEndDeveloper 1", 35, "Россия");
        frontEndDeveloper.gitMerge();
        frontEndDeveloper.gitPush();
        frontEndDeveloper.learnJavaScript();

        PythonDeveloper pythonDeveloper = new PythonDeveloper("PythonDeveloper 1", 30, "Россия");
        pythonDeveloper.connectDB();
        pythonDeveloper.learnSpecialDB();

        WebDeveloper webDeveloper = new WebDeveloper("WebDeveloper 1", 35, "Россия");
        webDeveloper.baseHTMLSyntax();
    }
}
