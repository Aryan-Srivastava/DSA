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
    private static int[][] rotateMatrix(int[][] mat){
        int n = mat.length, m = mat[0].length;
        int[][] ans = new int[n][m];
        for(int i = 0; i < n; i++)
            for(int j = 0; j < m; j++)
                ans[j][m-1-i] = mat[i][j];
        return ans;
    }

    //Method 2 -
    public static void rotateBy90(int[][] mat){
        transpose(mat);
        swapCol(mat);
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

    private static void swapCol(int[][] mat) {
        int i = 0,j = mat.length - 1 ;
        while(i < j){
            int[] temp = mat[i];
            mat[i] = mat[j];
            mat[j] = temp;
            i++; j--;
        }
    }
    
    //method 3 - 
    private static void rotateMatrix2(int[][] mat){
        int n = mat.length;
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
