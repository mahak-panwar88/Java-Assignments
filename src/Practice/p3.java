package Practice;

import java.util.Scanner;

public class p3 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int num = 45678;
        int count = 0;
        int temp = num;
        while(temp>0){
            temp /=10;
            count++;
            System.out.println(count);
        }
    }}
