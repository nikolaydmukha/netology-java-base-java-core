package main.java.home.javarush.javaSyntax.task13.task1319;

/* 
Месяцы в сезоне
*/

public enum Month {
    JANUARY,
    FEBRUARY,
    MARCH,
    APRIL,
    MAY,
    JUNE,
    JULY,
    AUGUST,
    SEPTEMBER,
    OCTOBER,
    NOVEMBER,
    DECEMBER;

    //напишите тут ваш код
    public static Month[] getWinterMonths() {
        Month[] winter = new Month[3];
        for (int i = 0; i <= 1; i++) {
            winter[i] = Month.values()[i];
        }
        winter[2] = Month.DECEMBER;
        return winter;
    }

    public static Month[] getSpringMonths() {
        Month[] spring = new Month[3];
        int j = 0;
        for (int i = 2; i <= 4; i++) {
            spring[j] = Month.values()[i];
            j++;
        }
        return spring;
    }

    public static Month[] getSummerMonths() {
        Month[] summer = new Month[3];
        int j = 0;
        for (int i = 5; i <= 7; i++) {
            summer[j] = Month.values()[i];
            j++;
        }
        return summer;
    }

    public static Month[] getAutumnMonths() {
        Month[] autumn = new Month[3];
        int j = 0;
        for (int i = 8; i <= 10; i++) {
            autumn[j] = Month.values()[i];
            j++;
        }
        return autumn;
    }
}
