package Questions;

//35. Leetcode - https://leetcode.com/problems/search-insert-position/

public class Search_Insert_Position {
    public static void main(String[] args) {
        int[] nums = { 1, 3, 5, 6 };
        int target = 2;
        int search = searchInsertPosition(nums, target);
        System.out.println(search);
    }

    private static int searchInsertPosition(int[] nums, int target) {
        int low = 0, high = nums.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return low;
    }
}
