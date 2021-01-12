package main.java.home.javarush.javaSyntax.task14.task1414;

public class Solution {

    public static final String OUTPUT_FORMAT = "Метод %s вызван из строки %d класса %s в файле %s.\n";

    public static void main(String[] args) {
        makeScrewdriver();
    }

    public static void printStackTrace(StackTraceElement[] stackTrace) {
        //напишите тут ваш код
//        Метод addJuice вызван из строки 24 класса com.javarush.task.pro.task14.task1414.Solution в файле Solution.java.
        for(int i = 0; i < stackTrace.length; i++){
            System.out.printf(OUTPUT_FORMAT, stackTrace[i].getMethodName(), stackTrace[i].getLineNumber(),
                    stackTrace[i].getClassName(), stackTrace[i].getFileName());
        }

    }

    static void makeScrewdriver() {
        addJuice();
    }

    static void addJuice() {
        addVodka();
    }

    static void addVodka() {
        printStackTrace(Thread.currentThread().getStackTrace());
    }
}
