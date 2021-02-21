package home.netology.javacore.multithreadingprogramming.volatiletasks.task1.utils;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Formatter;

public class DateUtil {

    public static String  printCurrentTime(){
        Date date = new Date();
        Formatter f = new Formatter();
        SimpleDateFormat formatForDateNow = new SimpleDateFormat("HH:mm:ss");

        return formatForDateNow.format(date);
    }
}
