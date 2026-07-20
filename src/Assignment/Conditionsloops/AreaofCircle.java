package Assignment.Conditionsloops;

import java.util.Scanner;

public class AreaofCircle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your radius here=");
        double radius = input.nextInt();
        double area = Math.PI*radius*radius;
        System.out.println("The area is ="+area);
    }
}
