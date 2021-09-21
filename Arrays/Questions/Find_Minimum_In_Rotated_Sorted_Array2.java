package Questions;

// 154. Leetcode - https://leetcode.com/problems/find-minimum-in-rotated-sorted-array-ii/

public class Find_Minimum_In_Rotated_Sorted_Array2 {
    public static void main(String[] args) {
        int[] nums = { 2, 2, 2, 0, 1 };
        int min = findMin(nums);
        System.out.println(min);
    }

    private static int findMin(int[] nums) {
        int low = 0, high = nums.length - 1;
        while (low < high) {
            int mid = low + (high - low) / 2;
            if (nums[mid] < nums[high])
                high = mid;
            else if (nums[mid] > nums[high])
                low = mid + 1;
            else
                high--;
        }
        return nums[low];
    }
}
