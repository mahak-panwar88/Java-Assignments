package Assignment.Conditionsloops;

import java.util.Scanner;

public class VolumeofPrism {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //The volume of prism is = base*height;
        System.out.println("Base=");
        double b = input.nextInt();
        System.out.println("Height");
        double h = input.nextInt();
        double volume = b*h;
        System.out.println("The volume"+volume);
    }
}
