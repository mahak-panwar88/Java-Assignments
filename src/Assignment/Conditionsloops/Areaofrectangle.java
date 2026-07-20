package Assignment.Conditionsloops;

import java.util.Scanner;

public class Areaofrectangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your breadth here");
        double breadth = input.nextDouble();
        System.out.println("Enter your length here");
        double length = input.nextDouble();
        double area = length*breadth;
        System.out.println("The area of rectangle is ="+area);
    }
}
