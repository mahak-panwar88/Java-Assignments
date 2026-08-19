package Java_classroom.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] name = new String[4];
        for (int i = 0; i < name.length; i++) {
            name[i] = input.next();
        }
       System.out.println(Arrays.toString(name));
        name[3] = "naam";
        System.out.println(Arrays.toString(name));

    }
}
