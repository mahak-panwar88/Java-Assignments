package Assignment.Firstjava02;

// java.sql.SQLOutput;
import java.util.Scanner;

public class IfConditions {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Write num 1=");
        int num1 = input.nextInt();
        System.out.println("Write num 2 =");
        int num2= input.nextInt();
        System.out.println("Enter operation (+,-,*,/)");
        char op = input.next().charAt(0);
        int result = 0;
        if (op == '+') {
            result = num1 +num2;
            System.out.println("Result="+result);
        } else if (op == '-') {
            result = num1-num2;
            System.out.println("Result="+result);
        } else if (op == '*') {
            result=num1*num2;
            System.out.println("Result="+result);
        } else if (op == '/') {
            if (num2 != 0) {
                result=num1/num2;
                System.out.println("Result="+result);
            }else{
                System.out.println("Cannot divide by 0");
            }
        }


    }
}
