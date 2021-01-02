package main.java.home.javamentor.determinegroup;

public class DetermineGroup {
    public static void main(String[] args) {
        // 1 - от 7 до 13 лет 2 - от 14 до 17 лет 3 - от 18 до 65 ле
        int age = 10;
        System.out.println(findYearGroup(age));
    }

    public static int findYearGroup(int age) {
        if ((age > 7) && (age <= 13)) {
            return 1;
        } else if ((age > 14) && (age <= 17)) {
            return 2;
        } else if ((age > 18) && (age <= 65)) {
            return 3;
        } else {
            return 0;
        }
    }
}
