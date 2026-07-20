package Assignment.Conditionsloops;

import java.util.Scanner;

public class Areaofrhombus {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first diagonal here=");
        double first = input.nextDouble();
        System.out.println("Enter second diagonal here = ");
        double second = input.nextDouble();
        double area = (1.0/2.0)*first*second;
        System.out.println("The area is "+area);
    }
}
