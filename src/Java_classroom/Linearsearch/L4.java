package Java_classroom.Linearsearch;

public class L4 {
    public static void main(String[] args) {
        int[] arr = {45,56,7,3,2,344};
        System.out.println(max(arr));

    } static int max(int[] arr){
        int ans = arr[0];
        for (int i = 0; i <arr.length ; i++) {
            if(ans<arr[i]){
                    ans = arr[i];
            }
            
        }
        return ans ;
    }
}
