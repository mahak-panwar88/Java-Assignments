package Assignment.Conditionsloops;

import java.util.Scanner;

public class Volumeofsphere {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter radius here=");
        double r = input.nextDouble();
        double v = (4.0/3.0)*Math.PI*r*r*r;
        System.out.println("The volume is "+v);
    }
}
