package Assignment.Conditionsloops;

import java.util.Scanner;

public class Areaofisoceles {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your base here=");
        double base = input.nextDouble();
        System.out.println("Enter your height here = ");
        double height = input.nextDouble();
        double area = (1.0/2.0)*base*height;
        System.out.println("The area of the isoceles traingle is ="+area);
    }
}
