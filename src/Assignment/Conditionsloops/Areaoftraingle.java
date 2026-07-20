package Assignment.Conditionsloops;

import java.util.Scanner;

public class Areaoftraingle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your length here=");
        double length = input.nextDouble();
        System.out.println("Enter your breadth here=");
        double breadth = input.nextInt();
        double area = (1.0/2.0)*length*breadth;
        System.out.println("The area of traingle is = "+area);

    }
}
