package Java_classroom.Linearsearch;

public class L3 {
    public static void main(String[] args) {
        int[] arr = {34, 45, 66, 3, 4, 344, 4533};
        int target = 3;
        System.out.println(linearsearch(arr, target, 1, 4));
    }

    static int linearsearch(int[] arr, int target, int start, int end) {
        if (arr.length == 0) {
            return -1;
        }
        for (int index = start; index <= end; index++) {
            int element = arr[index];
            if (element == target) {
                return index;
            }
        }
        return -1;
    }
}
