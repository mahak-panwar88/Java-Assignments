package Assignment.Methodsandfunctions;

import java.util.Scanner;

public class ques5 {
    // write your method here
    public static void productnumbers(int a , int b){
        int multiply = a*b;
        System.out.println(multiply);

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        productnumbers(num1,num2);

    }
}
