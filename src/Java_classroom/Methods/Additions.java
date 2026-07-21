package Java_classroom.Methods;

import java.util.Scanner;

public class Additions {
    public static void main(String[] args) {
        sum();
    }static void sum(){

    Scanner input = new Scanner(System.in);
        System.out.println("Enter your  1 number here=");
        int a = input.nextInt();
        System.out.println("Enter your 2 number here");
        int b = input.nextInt();
        int sum = a+b;
        System.out.println("The sum is ="+sum);
    }
}
