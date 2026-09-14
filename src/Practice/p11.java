package Practice;

public class p11 {
    public static void main(String[] args) {
        int digit = 8;
        int a = 0;
        int b = 1;
        for (int i = 0; i < digit; i++) {
            System.out.println(a);
            int next = a + b;
            a = b;
            b = next;
            System.out.println();
        }
    }
}
