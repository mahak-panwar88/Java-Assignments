package Assignment.Conditionsloops;

import java.util.Scanner;

public class PerimeterofParalleogram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your first side here =");
        double a= input.nextDouble();
        System.out.println("Enter your second side here =");
        double b = input.nextDouble();
        double perimeter = 2*(a+b);
        System.out.println("The perimeter is ="+perimeter);
    }
}
