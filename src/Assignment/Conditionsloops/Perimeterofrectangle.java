package Assignment.Conditionsloops;

import java.util.Scanner;

public class Perimeterofrectangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("The length =");
        double a = input.nextDouble();
        System.out.println("The breadth =");
        double b = input.nextDouble();
        double perimeter = 2*(a+b);
        System.out.println("The perimeter is ="+perimeter);
    }
}
