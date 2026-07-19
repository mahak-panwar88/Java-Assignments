package Java_classroom.Conditions06.Conditionsloops.Conditionsloops;

import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        while (num <= 5) {
            System.out.println(num);
            num += 1;
        }
    }
}
