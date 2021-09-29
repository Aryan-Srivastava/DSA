package Questions;

//48. Leetcode - https://leetcode.com/problems/rotate-image/

import java.util.Arrays;

public class Rotate_Image {
    public static void main(String[] args) {
        int[][] matrix = {
            { 5, 1, 9, 11 },
            { 2, 4, 8, 10 },
            { 13, 3, 6, 7 },
            { 15, 14, 12, 16 }
        };
        rotateImage(matrix);
        System.out.println(Arrays.deepToString(matrix));
    }

    //Method 1 - O(M)
    private static void rotateImage(int[][] matrix){
        swapRow(matrix);
        transpose(matrix);
    }
    private static void swapRow(int[][] matrix) {
        int i = 0, j = matrix.length - 1;
        while(i < j) {
            int[] temp = matrix[i];
            matrix[i] = matrix[j];
            matrix[j] = temp;
            i++;
            j--;
        }
    }

    private static void transpose(int[][] matrix) {
        for(int i = 0; i < matrix.length; i++) {
            for(int j = i+1; j < matrix[0].length; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
    }

    // Method 2 -

    // public static void rotate(int[][] matrix) {
    //     int n = matrix.length;
    //     for (int i = 0; i < (n + 1) / 2; i ++) {
    //         for (int j = 0; j < n / 2; j++) {
    //             int temp = matrix[n - 1 - j][i];
    //             matrix[n - 1 - j][i] = matrix[n - 1 - i][n - j - 1];
    //             matrix[n - 1 - i][n - j - 1] = matrix[j][n - 1 -i];
    //             matrix[j][n - 1 - i] = matrix[i][j];
    //             matrix[i][j] = temp;
    //         }
    //     }
    // }
}
