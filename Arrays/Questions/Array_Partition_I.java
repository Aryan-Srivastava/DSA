package Questions;

import java.util.Arrays;

public class Array_Partition_I {
    public static void main(String[] args) {
        int nums[] = {1, 4, 3, 2};
        int output = arrayPairSum(nums);
        System.out.println(output);
    }

    public static int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        // int i = 0, j = i+1;
        // int sum = 0;
        // while(j < nums.length){
        //     sum += Math.min(nums[i], nums[j]);
        //     i+=2; j+=2;
        // }
        int sum = 0;
        for(int i = 0; i < nums.length; i+=2) {
            sum += nums[i];
        }
        return sum;
    }
}
