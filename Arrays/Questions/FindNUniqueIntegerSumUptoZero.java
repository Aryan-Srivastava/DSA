package Questions;

import java.util.Arrays;

public class FindNUniqueIntegerSumUptoZero {
    public static void main(String[] args) {
        int n = 5;
        int[] arr = sumZero(n);
        System.out.println(Arrays.toString(arr));
    }

    private static int[] sumZero(int n) {
        int start = 0, end = n - 1;
        int[] res = new int[n];
        while (start < end) {
            res[start] = -end;
            res[end] = end;
            start++;
            end--;
        }
        return res;
    }

    // private static int[] sumZero(int n) {
    // int[] ans = new int[n];
    // for(int i = n - 1; i >= 0; i--)
    // ans[i] = i * 2 - n + 1;
    // return ans;
    // }
}
