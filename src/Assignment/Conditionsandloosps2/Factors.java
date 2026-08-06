package Assignment.Conditionsandloosps2;

//import java.util.Scanner;

public class Factors {
    public static void main(String[] args) {
        //Input a number and print all the factors of that number (use loops).
        // factors of 4 are 1,2,4
        //Scanner input = new Scanner(System.in);
        int num = 18;
        int i = 1;
        while (i<=num) {
            if(num%i==0){
                System.out.println(i);
        }i++;



        }
    }
}
