package Assignment.Conditionsloops;

import java.util.Scanner;

public class Perimeterofrhombus {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Side=");
        double s = input.nextDouble();
        double perimeter = s*4;
        System.out.println("The perimeter"+perimeter);
    }
}
