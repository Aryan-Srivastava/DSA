package Questions;

import java.util.*;

// leetcode 169 - https://leetcode.com/problems/majority-element/
public class majority_Element {
    public static void main(String[] args) {
        int[] nums = { 3, 2, 3 };
        System.out.println(optimized(nums));
    }

    private static int brute(int[] nums) {
        for(int i = 0; i < nums.length; i++) {
            int count = 0;
            int element = nums[i];
            for(int j = 0; j < nums.length; j++) {
                if(i != j) {
                    if(nums[j] == element) {
                        count++;
                    }
                }
                if(count > nums.length/2) {
                    return element;
                }
            }
        }
        return -1;
    }

    private static int better1(int[] nums) {
        if(nums.length <= 1)
            return nums[0];
        Arrays.sort(nums);
        int count = 1;
        for(int i = 0; i < nums.length - 1; i++) {
            if(nums[i] == nums[i+1]) {
                count++;
            } else {
                count = 1;
            }
            if(count > nums.length/2) 
                return nums[i];
        }
        return -1;
    }
    
    private static int better2(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length/2];
    }

    private static int better3(int[] nums) {
        if(nums.length <= 1)
            return nums[0];
        HashMap<Integer,Integer> map = new HashMap<Integer, Integer>();
        for(int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                int count = map.get(nums[i]) +1;
                if (count > nums.length /2) 
                    return nums[i];
                else
                    map.put(nums[i], count);
 
            }
            else
                map.put(nums[i],1);
            }
        return -1;
    }

    private static int optimized(int[] nums) {
        int count = 1, majority_index = 0;
        for(int i = 1; i < nums.length; i++) {
            if(nums[majority_index] == nums[i]) 
                count++;
            else 
                count--;
            if(count == 0) {
                majority_index = i;
                count = 1;
            }
        }
        return nums[majority_index];
    }
}
