package Assignment.Conditionsandloosps2;

import java.util.Scanner;

public class Numsum {
    public static void main(String[] args) {
        //Take integer inputs till the user enters 0 and print the sum of all numbers (HINT: while loop)
        Scanner input = new Scanner(System.in);
        int sum = 0;
        int num;

        do {
            num = input.nextInt();
            sum += num;
        } while (num != 0) ;

            System.out.println(sum);
        }
    }


