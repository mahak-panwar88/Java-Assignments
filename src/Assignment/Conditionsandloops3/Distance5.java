package Assignment.Conditionsandloops3;

import java.util.Scanner;

public class Distance5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // calculate the distance between two points
        // the formula is d^2 = (x2-x1)^2 + (y2-y1)^2
        int x2 = input.nextInt();
        int x1 = input.nextInt();
        int y1 = input.nextInt();
        int y2 = input.nextInt();
        double distance = Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));
        System.out.println(distance);
    }
}
