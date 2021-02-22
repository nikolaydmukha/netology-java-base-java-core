package home.netology.javacore.multithreadingprogramming.volatiletasks.task2.utils;

import java.text.DecimalFormat;

public class DoubleOutputUtil {

    public static String doubleFormatter(Double value) {
        DecimalFormat df2 = new DecimalFormat("#.##");
        return df2.format(value);
    }
}
