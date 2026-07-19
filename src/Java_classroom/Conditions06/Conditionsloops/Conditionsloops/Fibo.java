package Java_classroom.Conditions06.Conditionsloops.Conditionsloops;

import java.util.Scanner;

public class Fibo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int p = 0;
        int i = 1;
        int count=2;
        while (count<=n){
            int eg = i;
            i = i+p;
            p=eg;
            System.out.println(i);
            count++;
        }
    }
}
