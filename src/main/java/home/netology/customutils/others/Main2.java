package home.netology.customutils.others;

import java.time.LocalDate;

public class Main2 {
    public static void main(String[] args) {
        LocalDate promisedDay = LocalDate.now().plusDays(5);
        LocalDate today = LocalDate.now();
        System.out.println(promisedDay.isBefore(today.plusDays(5)));// || promisedDay.isEqual(today.plusDays(5)));
    }
}
