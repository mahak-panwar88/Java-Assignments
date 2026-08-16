package Assignment.Conditionsandloops3;

//import java.util.Scanner;

public class Reversestring {
    public static void main(String[] args) {
        //Scanner input = new Scanner(System.in);
        String name = "mahak panwar";
        String reversed = new StringBuilder(name).reverse().toString();//
        System.out.println("The original name of mine is = "+name);
        System.out.println("The reversed name of mine is = " + reversed);
    }
}
