package Assignment.Flowofprogram01;

import java.util.Scanner;

public class Leapyear {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int year = input.nextInt();
        if (year % 400 == 0) {
            System.out.println("The year is leap");
        } else if (year % 100 == 0) {
            System.out.println("The year is not leap");
        } else if (year % 4 == 0) {
            System.out.println("The year is leap");
        } else
        System.out.println("The year is leap");

        }
    }

