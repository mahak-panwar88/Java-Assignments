package Java_classroom.Arrays;

import java.util.Arrays;

public class arr2d4 {
    public static void main(String[] args) {
        int[] arr = {3, 45, 7888, 2, 345, 22, 9};
        System.out.println(max(arr));

    }

    static int max(int[] arr) {
        int maxVal = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > maxVal) {
                maxVal = arr[i];
            }
        }
        return maxVal;
    }
}



