package Assignment.Conditionsloops;

import java.util.Scanner;

public class Volumeofcone {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Write your radius here=");
        double r = input.nextInt();
        System.out.println("Write your height here = ");
        double h = input.nextInt();
        double volume = (1.0/3.0)*Math.PI*r*r*h;
        System.out.println("The volume is = "+volume);

    }
}
