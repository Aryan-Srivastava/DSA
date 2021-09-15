package Questions;

import java.util.Arrays;

// #73 leetcode - https://leetcode.com/problems/set-matrix-zeroes/

public class Set_Matrix_Zero {
    public static void main(String[] args) {
        int[][] mat = {{0, 1, 2, 0},
                       {3, 4, 5, 2},
                       {1, 3, 1, 5}};
        setMatrixZero(mat);
        System.out.println(Arrays.deepToString(mat));
    }

    private static void setMatrixZero(int[][] mat) {
        boolean firstRow = false, firstCol = false;
        //Check first Column
        for(int i = 0; i < mat.length; i++) {
            if(mat[i][0] == 0) {
                firstCol = true;
                break;
            }
        }
        //Check first Row
        for(int i = 0; i < mat[0].length; i++) {
            if(mat[0][i] == 0) {
                firstRow = true;
                break;
            }
        }
        //Check except first Row and first Column
        for(int i = 1; i < mat.length; i++) {
            for(int j = 1; j < mat[0].length; j++) {
                if(mat[i][j] == 0) {
                    mat[i][0] = 0;
                    mat[0][j] = 0;
                }
            }
        }
        //Process and mark 0 except first Row and first Column
        for(int i =1; i < mat.length; i++){
            for(int j = 1; j < mat[0].length; j++) {
                if(mat[i][0] == 0 || mat[0][j] == 0) {
                    mat[i][j] = 0;
                }
            }
        }
        //Handle first Column(if firstCol = true then mark all the element in first column as 0)
        if(firstCol) {
            for(int i = 0; i < mat.length; i++) {
                mat[i][0] = 0;
            }
        }
        //Handle first row(if firstRow = true then mark all the element in first row as 0)
        if(firstRow) {
            for(int i = 0; i < mat[0].length; i++){
                mat[0][i] = 0;
            }
        }
    }
}
