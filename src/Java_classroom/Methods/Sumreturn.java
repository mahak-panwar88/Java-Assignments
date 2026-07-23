package Java_classroom.Methods;

import java.util.Scanner;

public class Sumreturn {
    public static void main(String[] args) {
       int ans = sum();
        System.out.println(ans);
    }

    static int sum() {
        Scanner input = new Scanner(System.in);
        System.out.println("The no 1 is=");
        int num1 = input.nextInt();
        System.out.println("The no 2 is =");
        int num2 = input.nextInt();
        int sum = num1+num2;
        System.out.println("The ans is "+sum);
        return sum;

    }
}
