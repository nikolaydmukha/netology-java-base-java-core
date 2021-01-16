package home.javamentor.mergearrays;

import java.util.Arrays;

public class MergeArrays {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,3,12,19};
        int[] arr2 = new int[]{2,3,5};

        System.out.println(Arrays.toString(mergeArrays(arr1, arr2)));
    }
    public static int[] mergeArrays(int[] arr1, int[] arr2) {
        int[] result = new int[arr1.length + arr2.length];
        for(int i = 0; i < arr1.length; i++){
            result[i] = arr1[i];
        }
        int j = result.length - 1;
        for(int i= 0; i < arr2.length; i++){
            result[j] = arr2[i];
            j--;
        }
        Arrays.sort(result);
        return result;
    }
}
