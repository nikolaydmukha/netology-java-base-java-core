package main.java.home.javarush.task13.task1317;

/* 
Трансформируем enum в класс
*/

public class Month {

    public  static final main.java.home.javarush.task13.task1317.Month JANUARY = new Month(0);
    public  static final main.java.home.javarush.task13.task1317.Month FEBRUARY = new Month(1);
    public  static final main.java.home.javarush.task13.task1317.Month MARCH = new Month(2);
    public  static final main.java.home.javarush.task13.task1317.Month APRIL = new Month(3);
    public  static final main.java.home.javarush.task13.task1317.Month MAY = new Month(4);
    public  static final main.java.home.javarush.task13.task1317.Month JUNE = new Month(5);
    public  static final main.java.home.javarush.task13.task1317.Month JULY = new Month(6);
    public  static final main.java.home.javarush.task13.task1317.Month AUGUST = new Month(7);
    public  static final main.java.home.javarush.task13.task1317.Month SEPTEMBER = new Month(8);
    public  static final main.java.home.javarush.task13.task1317.Month OCTOBER = new Month(9);
    public  static final main.java.home.javarush.task13.task1317.Month NOVEMBER = new Month(10);
    public  static final main.java.home.javarush.task13.task1317.Month DECEMBER = new Month(11);


    private static final Month[] array = {
            JANUARY, FEBRUARY, MARCH, APRIL, MAY, JUNE, JULY, AUGUST, SEPTEMBER, OCTOBER, NOVEMBER, DECEMBER
    };

    public final int value;

    private Month(int value) {
        this.value = value;
    }

    public int ordinal() {
        return this.value;
    }

    public static Month[] values() {
        return array;
    }


}

