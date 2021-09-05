package Questions;

import java.util.Arrays;

public class TransposeOfMatrix {
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
        };
        System.out.println(Arrays.deepToString(transpose(matrix)));
    }

    private static int[][] transpose(int[][] matrix) {
        int n = matrix.length, m = matrix[0].length;
        int[][] temp = new int[m][n];
        for(int i = 0; i < n; i++)
            for(int j = 0; j < m; j++)
                temp[j][i] = matrix[i][j];
        return temp;
    }
}
