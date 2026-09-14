package Practice;

import java.util.Scanner;

public class p5 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int temp = n;
        int reversed = 0;
        while(temp>0){
            int digit = temp%10;
            reversed = (reversed*10)+digit;
            temp/=10;
            System.out.println(reversed);
        }
    }
}
