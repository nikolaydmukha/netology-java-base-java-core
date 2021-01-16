package home.javamentor.poweroftwo;

public class PowerOfTwo {
    public static void main(String[] args) {
        System.out.println(isPowerOfTwo(-5));
    }

    public static boolean isPowerOfTwo(int x) {

        int[] powerArray = new int[Math.abs(x)];

        for (int i = 0; i < Math.abs(x); i++) {
            powerArray[i] = (int) Math.pow(2, i);
        }

        for (int i = 0; i < powerArray.length; i++) {
            if (powerArray[i] == Math.abs(x)) {
                return true;
            }
        }
        return false;
    }
}
