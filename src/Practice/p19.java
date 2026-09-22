package Practice;

public class p19 {
    public static void main(String[] args) {
        //Matrix diagonal sum
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9},
        };
        int diagonal_sum =0;
        for (int i = 0; i <matrix.length; i++) {
            diagonal_sum += matrix[i][i];
        }
        System.out.println(diagonal_sum);
        }
        }




