package Assignment.Conditionsloops;

import java.util.Scanner;

public class Perimeterofcircle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your radius here");
        double radius = input.nextDouble();
        double perimeter = 2*Math.PI*radius;
        System.out.println("The perimeter is "+perimeter);
    }
}
