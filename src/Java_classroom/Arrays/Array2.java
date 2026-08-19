package Java_classroom.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Array2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        int[] rollno = new int[5];
        rollno[0] = 56;
        rollno[1] = 34;
        rollno[2] = 345;
        rollno[3] = 566;
        rollno[4] = 3456;
        System.out.println(rollno[3]);

        // input using loops
        for (int i = 0; i < rollno.length; i++) {
            rollno[i] = input.nextInt();
            for (int num : rollno) ;

            System.out.println(Arrays.toString(rollno));


        }
    }
}
