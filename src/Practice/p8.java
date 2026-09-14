package Practice;

public class p8 {
    public static void main(String[] args) {
        int[] numbers  ={1,4,6,7,3,5};
        int even = 0;
        int odd = 0;
        for(int num:numbers ){
            if(num%2==0) {
                even += num;
            }else{
                odd += num;
                System.out.println("Odd numbers sum"+odd );
                System.out.println("Even numbers sum"+even);
            }
        }
    }
}
