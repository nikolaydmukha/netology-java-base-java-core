package main.java.home.javamentor.binaryoperations;

public class BinaryOperations {
    public static void main(String[] args) {
        int a = 4;
        int b = 25;
        int c = -8;

        System.out.println("до сдвига       a = " + a + "      двоичная система a = " + Integer.toBinaryString(a));
        System.out.println("после сдвига    а = " + Integer.parseInt(Integer.toBinaryString(a << 1), 2) + "      двоичная система a = " + Integer.toBinaryString(a << 1));

        System.out.println("до сдвига       b = " + b + "      двоичная система b = " + Integer.toBinaryString(b));
        System.out.println("после сдвига    b = " + Integer.parseInt(Integer.toBinaryString(b >> 1), 2) + "      двоичная система b = " + Integer.toBinaryString(b >> 1));

        System.out.println("до сдвига       c = " + c + "      двоичная система b = " + Integer.toBinaryString(b));
        System.out.println("после сдвига    c = " + Integer.parseInt(Integer.toBinaryString(c >>> 2), 2) + "      двоичная система c = " + Integer.toBinaryString(c >>> 1));

        //проверка на чётность
        System.out.println(a & 1);
        System.out.println(25 & 1);

        //для итогового результат вычисляют оба операнда
        System.out.println(true | true);
        System.out.println(true | false);
        System.out.println(false | true);

        //для итогового результат вычисляют сначала один операнд, а второй - при необходимости
        System.out.println(true || true);
        System.out.println(true || false);
        System.out.println(false || true);

        System.out.println(true ^ true);
        System.out.println(false ^ false);
        System.out.println(true ^ false);
        System.out.println(false ^ true);

    }
}
