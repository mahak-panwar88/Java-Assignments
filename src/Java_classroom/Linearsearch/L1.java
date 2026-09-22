package Java_classroom.Linearsearch;

public class L1 {
    public static void main(String[] args) {
        int[] nums = {34, 45, 5, 6, 7, 8, 4};
        int target = 5;
        int ans = linearsearch(nums, target);
        System.out.println(ans);
    }//Search in the array if item found return index otherwise return -1

    static int linearsearch(int[] arr, int target) {
      if (arr.length == 0) {
            return -1;
        }// for a loop
        for (int index = 0; index < arr.length; index++) {
            int element = arr[index];
            if (element == target) {
                return index;
            }
        }
        return -1;
    }
}