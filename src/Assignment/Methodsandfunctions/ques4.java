package Assignment.Methodsandfunctions;

import java.util.Scanner;

public class ques4 {
    // first write your method here
    public static void addnumbers(int a,int b){
        int sum = a+b;
        System.out.println(sum);

    }
    public static void main(String[] args) {
        // print the sum of two number provided by the user by defining the own methods
        Scanner input = new Scanner(System.in);
        int num1 = input.nextInt();
        int num2  = input.nextInt();
        addnumbers(num1,num2);


    }
}
