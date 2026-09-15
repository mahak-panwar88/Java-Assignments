package Practice;

public class p17 {
    public static void main(String[]  args){
        // Task is to count the occurence of the number in the list
        int[] list ={4,6,7,2,4,6,7,2,2,2,4,4,4,4,4};
        int target = 4;
        int count = 0;
        for (int num:list){
            if ( num ==target){
                count++;
System.out.println(count);
        }
        }
    }
}
