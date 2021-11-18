package Questions;

import java.util.Arrays;

public class Longest_Consecutive_Subsequence {
    public static void main(String[] args) {
        int[] nums = { 9, 1, 4, 7, 3, -1, 0, 5, 8, -1, 6 };
        int output = longestConsecutive(nums);
        System.out.println(output);
    }

    public static int longestConsecutive(int[] nums) {
        if (nums.length < 1)
            return 0;
        int ans = 1;
        Arrays.sort(nums);
        int count = 1;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] != nums[i + 1]) {
                if (nums[i] == (nums[i + 1] - 1)) {
                    count++;
                } else {
                    ans = count > ans ? count : ans;
                    count = 1;
                }
            }
        }
        return ans > count ? ans : count;
    }
}