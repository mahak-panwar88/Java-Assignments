package Assignment.Methodsandfunctions;

import java.util.Scanner;

public class quest1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
//        int max = a;
//        if (b > c) {
//            System.out.println(b);
//        } else if (c > b) {
//            System.out.println(c);
        int max = Math.max(a,Math.max(c,b));
        int min = Math.min(a,Math.min(c,b));
        System.out.println("The maximum value of the number is="+max);
        System.out.println("The minimum value of the number is= "+min);

        }
    }


