package Questions;

import java.util.Arrays;

public class Rotate_Array_by_k_To_Right {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6 , 7};
        right_Rotate(arr, 3);
        System.out.println(Arrays.toString(arr));
    }

    private static void right_Rotate(int[] arr, int k) {
        int n = arr.length;
        // This statement checks whether the entered rotating factor k is within the length of the array
        k = k % n;
        // first rotate whole array
        // 1 2 3 4 5 6 7
        // 7 6 5 4 3 2 1
        rotateArray(arr, 0, n-1);
        // then rotate it from 0 to k-1
        // [5 6 7] 4 3 2 1
        rotateArray(arr, 0, k-1);
        // then rotate the rest array from k to n-1
        // 5 6 7 [1 2 3 4]
        rotateArray(arr, k, n-1);
    }

    private static void rotateArray(int[] arr, int start, int end) {
        int temp = 0;
        while(start < end){
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++; end--;
        }
    }
}
