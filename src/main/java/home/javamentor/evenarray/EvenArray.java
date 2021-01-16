package home.javamentor.evenarray;

public class EvenArray {
    public static void main(String[] args) {
        System.out.println(evenArray(3));
    }

    public static int[] evenArray(int number) {
        System.out.println("2222");
        int[] result = new int[number / 2];
        int i = 1;
        int j = 0;
        while (i <= number) {
            if (i % 2 == 0) {
                result[j] = i;
                j++;
            }
            i++;
        }
        return result;
    }
}
