package Questions;

public class maximum_Sum_Subarray {
    public static void main(String[] args) {
        int[] nums = { 4, 3, -2, 6, 14, 7, -1, 4, 5, 7, -10, 2, 9, -10, -5, -9, 6, 1 };
        int maxSum = findSum(nums);
        System.out.println(maxSum);
    }

    private static int findSum(int[] nums) {
        int current = nums[0];
        int max = nums[0];
        for(int i = 1; i < nums.length; i++){
            current += Math.max(current, nums[i]);
            max = Math.max(current, max);
        }
        return max;
    }
}
