package main.java.home.hackerrank.stringconverter;

public class StringConverter {
    /*
    Конвертер строки
    */
    public static void main(String[] args) {
        String string = "12.84";
        //напишите тут ваш код
        StringBuilder stringBuilder = new StringBuilder(string);
        System.out.println(Math.round(Double.parseDouble(stringBuilder.reverse().toString())));
    }

}
