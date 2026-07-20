package Assignment.Conditionsloops;

import java.util.Scanner;

public class Curvedsurfaceareaofcylinder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter radius here=");
        double r = input.nextDouble();
        System.out.println("Enter height here =");
        double h = input.nextDouble();
        double csa = 2*Math.PI*r*h;
        System.out.println("The csa is "+csa);
    }
}
