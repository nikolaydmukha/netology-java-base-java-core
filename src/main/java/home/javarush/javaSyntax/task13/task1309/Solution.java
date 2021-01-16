package home.javarush.javaSyntax.task13.task1309;

import java.util.HashMap;

/* 
Успеваемость студентов
*/

public class Solution {
    public static HashMap<String, Double> grades = new HashMap<>();

    public static void main(String[] args) {
        addStudents();
        System.out.println(grades);
    }

    public static void addStudents() {
        //напишите тут ваш код
        grades.put("1", 5.0);
        grades.put("2", 5.0);
        grades.put("3", 5.0);
        grades.put("4", 5.0);
        grades.put("5", 5.0);
    }
}
