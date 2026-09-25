package Assignment.Methodsandfunctions;
import java.util.Arrays;
public class ques7 {
    // Write a function to check if a given triplet is a Pythagorean triplet or not.
    //1 defining the method for the question
    public static boolean isTriplet(int a , int b , int c ){
        if(a<=0||b<=0||c<=0){
            return false;
        }// sorting the three numbers in the array
        int[] sides= {a,b,c};
        Arrays.sort(sides);
        int x = sides[0];
        int y = sides[1];
        int z = sides[2];
        return (x*x)+(y*y)==(z*z);
    }

    public static void main(String[] args) {
        System.out.println(isTriplet(3,4,5));
        System.out.println(isTriplet(2,9,4));
    }
}
