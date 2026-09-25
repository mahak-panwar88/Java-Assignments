package Assignment.Methodsandfunctions;

import java.util.Scanner;

public class ques6 {
    // Write a program that will ask the user to enter his/her marks (out of 100). Define a method that will display grades according to the marks entered as below:
 public static void displaygrades(int n) {
        if (n < 0 || n > 100) {
            System.out.println("Invalid input");
        } else if (n >= 91) {
            System.out.println("Grade AA");
        } else if (n >= 81) {
            System.out.println("Grade: AB");
        } else if (n >= 71) {
            System.out.println("Grade: BB");
        } else if (n >= 61) {
            System.out.println("Grade: BC");
        } else if (n >= 51) {
            System.out.println("Grade: CD");
        } else if (n >= 41) {
            System.out.println("Grade: DD");
        } else {
            System.out.println("Grade: Fail");
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n  = input.nextInt();
        displaygrades(n);
    }
     }



