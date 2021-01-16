package home.javarush.javaSyntax.task13.task1318;

/* 
Следующий месяц, пожалуйста
*/

public class Solution {

    public static void main(String[] args) {
        System.out.println(getNextMonth(home.javarush.task1318.Month.JANUARY));
        System.out.println(getNextMonth(home.javarush.task1318.Month.DECEMBER));
    }

    public static home.javarush.task1318.Month getNextMonth(home.javarush.task1318.Month month) {
        //напишите тут ваш код
        int size = home.javarush.task1318.Month.values().length;
        int pointerMonth = month.ordinal();
        if (pointerMonth + 1 >= size){
            pointerMonth = 0;
            return home.javarush.task1318.Month.values()[pointerMonth];
        }
        return home.javarush.task1318.Month.values()[pointerMonth + 1];
    }
}
