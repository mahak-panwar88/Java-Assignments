package Assignment.Conditionsandloosps2;

import java.util.Arrays;
import java.util.Scanner;

public class Creatinganarray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr = {1, 3, 45, 67};
        change(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void change(int[] nums){
    nums[0]=98;

    }
}