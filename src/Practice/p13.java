package Practice;

public class p13 {
    public static void main(String[] args) {
        // Palindrome Integer Checker
        int num =12321;
        int temp = num;
        int reversed = 0;
        while (temp > 0){
            int digit = temp%10;
            reversed = (reversed*10)+digit;
            temp/=10;
            System.out.println(reversed);
        } if ( reversed == num){
            System.out.println("Yes it is palindrome no ");
        }

    }
}
