package Java_classroom.Arrays;

import java.util.Scanner;

public class arr2D1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        /*
          [ 1,2,3]
          [ 4,5,6]
          [7,8,9]


         */
        int[][] arr = new int[3][3];
        int[][] arr2D = {
                {1, 2, 3}, // oth index
                {4, 5, 6},// 1st index
                {7, 8, 9} // 2nd index
        };
        System.out.println(arr.length);// no of rows
        // input
        for (int rows = 0; rows < arr.length; rows++) {
            // no of col
            for (int col = 0; col < arr[rows].length; col++) {
                arr[rows][col] = input.nextInt();

            }
            // output
            for (int r = 0; r < arr.length; r++) {
                // no of col
                for (int col = 0; col < arr[r].length; col++) {
                    System.out.println(arr[r][col] + "");
                }
                System.out.println();




            }


        }

    }
}