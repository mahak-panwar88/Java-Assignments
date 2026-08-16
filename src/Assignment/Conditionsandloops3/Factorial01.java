package Assignment.Conditionsandloops3;

import java.util.Scanner;

public class Factorial01 {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        // factorial = 4=4*3*2*1
        int n = input.nextInt();// take input from the user as integer
        long factorial = 1; // used long methods to find the results
        for (int i = 1; i <=n ; i++) { // the loop
            factorial *=i; // it means that the factorail is used to do (1*2*3*.....*n)
            System.out.println("Factorial ="+factorial);
        }
    }
}
