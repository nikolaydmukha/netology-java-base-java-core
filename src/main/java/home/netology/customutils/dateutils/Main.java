package home.netology.customutils.dateutils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Main {
    public static void main(String[] args) throws ParseException {
        String srcDate =  "2024-03-06";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Calendar c = Calendar.getInstance();
        c.setTime(sdf.parse(srcDate));
        c.add(Calendar.DATE, -20);
        System.out.println(sdf.format(c.getTime()));
    }
}
