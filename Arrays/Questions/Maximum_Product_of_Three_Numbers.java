package Questions;

import java.util.Arrays;

public class Maximum_Product_of_Three_Numbers {
    public static void main(String[] args) {
        int[] nums = {-5, -2, 3, 4};
        int output = maximumProduct(nums);
        System.out.println(output); 
    }
    public static int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length - 1;
        int x = nums[n] * nums[n-1] * nums[n-2];
        int y = nums[0] * nums[1] * nums[n];
        return x > y ? x : y;
    }
}
