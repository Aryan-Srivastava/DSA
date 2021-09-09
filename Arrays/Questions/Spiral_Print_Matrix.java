package Questions;

import java.util.*;

public class Spiral_Print_Matrix {
    public static void main(String[] args) {
        int arr[][] = { { 1, 2, 3, 4, 5, 6 }, 
                        { 7, 8, 9, 10, 11, 12 }, 
                        { 13, 14, 15, 16, 17, 18 } };
        ArrayList<Integer> list = print(arr, 3, 6);
        System.out.println(list.toString());
    }

    private static ArrayList<Integer> print(int[][] arr, int row, int col) {
        ArrayList<Integer> l = new ArrayList<Integer>();
        int top = 0, bottom = arr.length - 1, right = arr[0].length - 1, left = 0;
        int dir = 0;
        for(int i = 0; i < row; i++){
            if(dir == 0){
                for(int j = left; j <= right; j++){
                    l.add(arr[top][j]);
                    dir = 1;
                }
                top++;
            }
            if(dir == 1){
                for(int j = top; j <= bottom; j++){
                    l.add(arr[j][right]);
                    dir = 2;
                }
                right--;
            }
            if(dir == 2){
                for(int j = right; j >= left; j--){
                    l.add(arr[bottom][j]);
                    dir = 3;
                }
                bottom--;
            }
            else{
                for(int j = bottom; j >= top; j--){
                    l.add(arr[j][left]);
                    dir = 0;
                }
                left++;
            }
        }
        return l;
    }
}