package Questions;

public class search_In_Rotated_Sorted_Array {
    public static void main(String[] args) {
        int[] nums = { 4, 5, 6, 7, 0, 1, 2, 3 };
        int target = 5;
        System.out.println(twoPointer(nums, target));
        System.out.println(binarySearch(nums, target));
    }

    // Method 1 -
    private static int twoPointer(int[] nums, int target) {
        int l = 0, r = nums.length - 1;
        while (l <= r) {
            if (nums[l] == target)
                return l;
            if (nums[r] == target)
                return r;
            l++;
            r--;
        }
        return -1;
    }

    // Method 2 -
    private static int binarySearch(int[] nums, int target) {
        int minIdx = findMin(nums);
        if (nums[minIdx] <= target && nums[nums.length - 1] >= target)
            return search(nums, target, minIdx, nums.length - 1);
        else
            return search(nums, target, 0, minIdx - 1);
    }

    private static int search(int[] nums, int target, int low, int high) {
        int mid = low + (high - low) / 2;
        if (low > high)
            return -1;
        if (nums[mid] == target)
            return mid;
        else if (nums[mid] < target)
            return search(nums, target, mid + 1, high);
        else
            return search(nums, target, low, mid - 1);
    }

    private static int findMin(int[] nums) {
        int left = 0, right = nums.length - 1;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] > nums[right])
                left = mid + 1;
            else
                right = mid;
        }
        return left;
    }
}
