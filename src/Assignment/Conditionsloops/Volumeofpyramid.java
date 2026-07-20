package Assignment.Conditionsloops;

import java.util.Scanner;

public class Volumeofpyramid {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter radius=");
        double r = input.nextInt();
        System.out.println("Enter height");
        double h = input.nextInt();
        double v = (1.0/3.0)*r*h;
        System.out.println("The volume is ="+v);
    }
}
