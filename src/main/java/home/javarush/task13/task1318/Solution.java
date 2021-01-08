package main.java.home.javarush.task13.task1318;

/* 
Следующий месяц, пожалуйста
*/

public class Solution {

    public static void main(String[] args) {
        System.out.println(getNextMonth(main.java.home.javarush.task1318.Month.JANUARY));
        System.out.println(getNextMonth(main.java.home.javarush.task1318.Month.DECEMBER));
    }

    public static main.java.home.javarush.task1318.Month getNextMonth(main.java.home.javarush.task1318.Month month) {
        //напишите тут ваш код
        int size = main.java.home.javarush.task1318.Month.values().length;
        int pointerMonth = month.ordinal();
        if (pointerMonth + 1 >= size){
            pointerMonth = 0;
            return main.java.home.javarush.task1318.Month.values()[pointerMonth];
        }
        return main.java.home.javarush.task1318.Month.values()[pointerMonth + 1];
    }
}
