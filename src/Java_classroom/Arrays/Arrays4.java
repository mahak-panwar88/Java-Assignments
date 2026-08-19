package Java_classroom.Arrays;

import java.util.Arrays;

public class Arrays4 {
    public static void main(String[] args) {
        int[] numbers = {4, 2, 56, 44}; // Write your numbers here
        System.out.println(Arrays.toString(numbers)); // This will change into the arrays
        changing(numbers); // if we want to change the arrays do this after writing the static void changing below first
        System.out.println(Arrays.toString(numbers));

    }

    static void changing(int[]  arr) {// will change the arrays into the desired input
        arr[0] = 67;

    }
}