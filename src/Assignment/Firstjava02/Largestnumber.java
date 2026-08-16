package Assignment.Firstjava02;

import java.util.Scanner;

public class Largestnumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your first number here=");
        int a = input.nextInt();
        System.out.println("Enter your second number here=");
        int b = input.nextInt();
//        if (a >= b) {
//            System.out.println("The largest number among two numbers is ="+a);
//        } else if (b >= a) {
//            System.out.println("The largest number among two numbers is ="+b);
//        }
        int max = a;
        if (b>a) {
            System.out.println("The largest is number " + b);
        }else{
            System.out.println("The  number is"+max);
        }
    }
}
