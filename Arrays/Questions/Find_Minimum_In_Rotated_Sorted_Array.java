package Questions;

//153 - Leetcode - https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/

public class Find_Minimum_In_Rotated_Sorted_Array {
    public static void main(String[] args) {
        int[] nums = { 4, 5, 6, 7, 1, 2 };
        int min = findMin(nums);
        System.out.println(min);
    }

    //Method 1 - Binary search
    private static int findMin(int[] nums) {
        int low = 0, high = nums.length - 1;
        while(low < high) {
            int mid = low + (high - low) / 2;
            if(nums[mid] < nums[high])
                high = mid;
            else
                low = mid + 1;
        }
        return nums[low];
    }

    //Method 2 - Not acceptable in this question

    // private static int findMin2(int[] nums) {
    //     int min = nums[0];
    //     for(int i = 1; i < nums.length; i++)
    //         min = Math.min(min, nums[i]);
    //     return min;
    // }
}
