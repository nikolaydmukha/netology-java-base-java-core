package home.netology.customutils.others;

import java.time.Clock;
import java.time.LocalDate;

public class Main2 {
    public static void main(String[] args) {
        LocalDate promisedDay = LocalDate.now().plusDays(5);
        LocalDate today = LocalDate.now(Clock.systemDefaultZone());

        LocalDate payDate = LocalDate.parse("2021-03-23");
        System.out.println(payDate);

        System.out.println(String.valueOf(payDate.equals(today)));
        System.out.println(promisedDay.isBefore(today.plusDays(5)));// || promisedDay.isEqual(today.plusDays(5)));
    }
}
