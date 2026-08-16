package Assignment.Conditionsandloops3;

import java.util.Scanner;

public class Discount04 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        // Discount rate of the product is = (initial rate) * (Discount rate) /100
        System.out.println("Enter your initial rate here =");
        int i = input.nextInt();
        System.out.println("Enter your discount rate here =");
        int d = input.nextInt();
        System.out.println("The discount rate of the product is =");
        int dr = i*d/100;
        System.out.println(dr);
        System.out.println("The amount to pay is ");
        int a = i-dr;
        System.out.println(a);
    }
}
