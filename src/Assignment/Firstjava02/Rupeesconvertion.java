package Assignment.Firstjava02;

import java.util.Scanner;

public class Rupeesconvertion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your rupees here =");
        double rupees = input.nextDouble();
        double usdRate = 83.5;
        double usd = rupees/usdRate;
        System.out.println("Amount in usd is "+usd);
    }
}
