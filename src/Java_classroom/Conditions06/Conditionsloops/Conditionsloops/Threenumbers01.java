package Java_classroom.Conditions06.Conditionsloops.Conditionsloops;

import java.util.Scanner;

public class Threenumbers01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b= input.nextInt();
        int c= input.nextInt();
        //Find the largest of these two numbers
        int max = a;
        if (b > max) {
            max= b;
        }
        if (c > max) {
            max=c;
        }
        System.out.println("The max number is =");

        System.out.println(max);


        }
    }

