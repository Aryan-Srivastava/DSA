package Questions;

import java.util.Arrays;

public class MoveZeros {
    public static void main(String[] args) {
        int[] nums = { 0, 1, 0, 3, 12 };
        moveZeroes(nums);
        System.out.println(Arrays.toString(nums));
    }

    public static void moveZeroes(int[] nums) {
        int lastNonZeroPlace = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0)
                nums[lastNonZeroPlace++] = nums[i];
        }
        for (int i = lastNonZeroPlace; i < nums.length; i++) {
            nums[i] = 0;
        }
    }
}
