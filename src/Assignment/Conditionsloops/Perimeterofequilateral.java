package Assignment.Conditionsloops;

import java.util.Scanner;

public class Perimeterofequilateral {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your side here");
        double side= input.nextDouble();
        double perimeter = side+side+side;
        System.out.println("The perimeter is "+perimeter);
    }
}
