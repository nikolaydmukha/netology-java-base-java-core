package main.java.home.javamentor.printoddnumbers;

public class PrintOddNumbers {
    public static void main(String[] args) {
        int[] arr = {0, -3,2, 3, 4, 5, 6, 7, 7, 8, 9};
        System.out.println(printOddNumbers(arr));
    }

    public static String printOddNumbers(int[] arr) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            if ((arr[i] % 2 != 0)) {
                result = result.append(arr[i]).append(',');
            }
        }
        return result.deleteCharAt(result.length() - 1) + "\n";
    }
}
