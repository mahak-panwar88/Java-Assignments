package Java_classroom.Methods;

//import java.util.Scanner;

import java.util.Scanner;

public class Returnsum {
    public static void main(String[] args) {
        int ans = sum1();
        System.out.println(ans);

    } static int sum1() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your number here");
        int num1 = input.nextInt();
        System.out.println("Enter your second number here");
        int num2 = input.nextInt();
        int sum = num1+num2;
        return sum;
    }
}
