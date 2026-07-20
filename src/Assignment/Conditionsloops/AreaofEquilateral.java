package Assignment.Conditionsloops;

import java.util.Scanner;

public class AreaofEquilateral {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your side here =");
        double side = input.nextDouble();
        double area = Math.sqrt(3.0/4.0)*side*side;
        System.out.println("The area is"+area);
    }
}
