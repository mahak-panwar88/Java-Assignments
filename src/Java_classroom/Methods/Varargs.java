package Java_classroom.Methods;

import java.util.Arrays;
import java.util.Scanner;

public class Varargs {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        fun(2,3,4,5,7,8,654,3,44);
    } static void fun(int...v){
        System.out.println(Arrays.toString(v));
    }
}
