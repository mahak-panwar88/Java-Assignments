package Assignment.Firstjava02;

import java.util.Scanner;

public class Simpleinterest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter Principle here =");
        double a = input.nextDouble();
        System.out.println("Enter Time here =");
        double b = input.nextDouble();
        System.out.println("Enter Rate here =");
        double c= input.nextDouble();
        double si = a*b*c/100;
        System.out.println("The simple interest is ="+si);
    }
}
