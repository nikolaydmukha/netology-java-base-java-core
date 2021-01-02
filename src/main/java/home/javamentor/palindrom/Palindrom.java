package main.java.home.javamentor.palindrom;

public class Palindrom {
    public static void main(String[] args) {
        String checkedString = "Eva, Can I Stab Bats In A Cave?";
        System.out.println(isPalindrom(checkedString));

    }

    public static boolean isPalindrom(String checkedString) {
        String reverse = "";
        String formatted = checkedString.replaceAll("[^A-Za-zА-Яа-я0-9]", "");
        for (int i = formatted.length() - 1; i >= 0; i--) {

            reverse += formatted.charAt(i);
        }
        return formatted.equalsIgnoreCase(reverse);
    }
}
