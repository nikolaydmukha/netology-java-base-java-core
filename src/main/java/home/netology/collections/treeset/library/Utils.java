package main.java.home.netology.collections.treeset.library;

import java.util.InputMismatchException;

public class Utils {

    public static int validateInt(String value) throws NumberFormatException, InputMismatchException {
        int point = 0;
            point = Integer.parseInt(value);
        return point;
    }


    public static int validateIntInInterval(String value, int maxValue) throws WrongIntervalException,
            NumberFormatException, InputMismatchException {
        int point = 0;
            point = Integer.parseInt(value);
            if (point < 0 || point > maxValue) {
                throw new WrongIntervalException("Выберите в диапазоне от 1 до " + maxValue);
            }
        return point;
    }
}
