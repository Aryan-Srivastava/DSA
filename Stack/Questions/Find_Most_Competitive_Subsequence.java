package Questions;

import java.util.*;

public class Find_Most_Competitive_Subsequence {
    public static void main(String[] args) {
        int[] nums = { 3, 5, 2, 6 };
        int k = 2;
        int[] result = mostCompetitive(nums, k);
        System.out.println(Arrays.toString(result));
        int[] result2 = mostCompetitive2(nums, k);
        System.out.println(Arrays.toString(result2));
    }

    // Using stack
    public static int[] mostCompetitive(int[] nums, int k) {
        Stack<Integer> s = new Stack<>();
        for (int i = 0; i < nums.length; i++) {
            while (!s.empty() && s.peek() > nums[i]
                    && nums.length - i + s.size() > k)
                s.pop();
            if (s.size() < k)
                s.push(nums[i]);
        }
        int[] ans = new int[k];
        for (int i = k - 1; i >= 0; i--) {
            ans[i] = s.pop();
        }
        return ans;
    }

    // Using Array
    public static int[] mostCompetitive2(int[] nums, int k) {
        int stack[] = new int[k], n = nums.length, j = 0;
        for (int i = 0; i < n; ++i) {
            while (j > 0 && stack[j - 1] > nums[i] && j - 1 + n - i >= k)
                j--;
            if (j < k)
                stack[j++] = nums[i];
        }
        return stack;
    }
}
