package Assignment.Methodsandfunctions;

import java.util.Scanner;

public class ques3 {
    public static void main(String[] args) {
       // A person is eligible to vote if his/her age is greater than or equal to 18. Define a method to find out if he/she is eligible to vote.
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the age of the person");
        int n = input.nextInt();
        if (n>=18){
            System.out.println("Yes you are allowed to vote");
        }else{
            System.out.println("No you are not eligible to vote");
        }
    }
}
