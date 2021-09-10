package Questions;

import java.util.Arrays;

public class Rotate_Matrix {
    public static void main(String[] args) {
        int[][] mat = {{0, 0}, {0, 1}};
        int[][] target = {{0, 0}, {1, 0}};
        boolean ans = findRotation(mat, target);
        System.out.println(ans);
    }

    public static boolean findRotation(int[][] mat, int[][] target) {
        int n = 0;
        while(n < 4){
            if(Arrays.deepEquals(mat, target))
                return true;
            rotateBy90(mat);
            n++;
        }
        return false;
    }
    //method 1 - 
    private static int[][] rotateMatrix(int[][] mat, int[][] target){
        for(int row = 0; row < mat.length; row++){
            for(int col = 0; col < mat[row].length; col++){
                int temp = mat[row][col];
                mat[row][col] = mat[col][row];
                mat[row][col] = temp;
            }
        }
        int start = 0, end = mat.length - 1;
        while (start < end) {
            int[] row = mat[start];
            mat[start] = mat[end];
            mat[end] = row;
            start++; end--;
        }
        return mat;
    }
    //Method 2 -
    public static void rotateBy90(int[][] mat){
        transpose(mat);
        reverseCol(mat);
    }

    private static void transpose(int[][] mat) {
        for(int i = 0; i < mat.length; i++){
            for(int j = i+1; j < mat[i].length; j++){
                int temp = mat[i][j];
                mat[i][j] = mat[j][i];
                mat[j][i] = temp;
            }
        }
    }

    private static void reverseCol(int[][] mat) {
        int i = 0,j = mat.length - 1 ;
        while(i < j){
            int[] temp = mat[i];
            mat[i] = mat[j];
            mat[j] = temp;
            i++; j--;
        }
    }
    //method 3 - 
    private static void rotateMatrix2(int[][] mat, int[][] target){
        int n = mat.length, m = mat[0].length;
        for(int i = 0; i < n/2; i++){
            int last = n-1-i;
            for(int j = i; j < last; j++){
                int off = j - i;
                int temp = mat[i][j];
                mat[i][j] = mat[last-off][i];
                mat[last-off][i] = mat[last][last-off];
                mat[last][last-off] = mat[j][last];
                mat[j][last] = temp;
            }
        }
    }
}
