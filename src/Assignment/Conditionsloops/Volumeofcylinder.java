package Assignment.Conditionsloops;

import java.util.Scanner;

public class Volumeofcylinder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter radius");
        double r = input.nextDouble();
        System.out.println("Enter height");
        double h = input.nextDouble();
        double volume = Math.PI*r*r*h;
        System.out.println("The volume is ="+volume);
    }
}
