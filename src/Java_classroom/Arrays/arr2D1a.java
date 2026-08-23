package Java_classroom.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class arr2D1a {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] num = {
                {1, 2, 3},
                {4, 5, 6},
        };
        for(int[] row : num)
            System.out.println(Arrays.toString(row));
        }
    }

