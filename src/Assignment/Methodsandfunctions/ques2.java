package Assignment.Methodsandfunctions;

import java.util.Scanner;

public class ques2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        if(a% 2==0) {
            System.out.println(a);
            System.out.println(b);
        }else{
            System.out.println(b);
            System.out.println(a);
        }
    }
}
