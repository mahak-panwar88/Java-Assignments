package Practice;

public class p10 {
    public static void main(String[] args){
        int[] numbers = {34,56,88,2,37};
        int max = numbers[0];
        int min = numbers[0];
        for(int num :numbers){
          if (num>max){
               max = num ;}
            { if (num<min){
                min = num;
            }
            System.out.println(max); System.out.println(min);
          }
        }
    }
}
