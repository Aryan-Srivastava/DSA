package Questions;

import java.util.*;

public class Find_All_Missings {
    public static void main(String[] args) {
        int[] nums = {4, 3, 2, 7, 8, 2, 3, 1};
        List<Integer> list = missing(nums);
        List<Integer> list2 = missingOptimal(nums);
        System.out.println(list);
        System.out.println(list2);
    }

    //Method 1 - Brute force
    //Time complexity - O(n)
    //Space complexity - O(n)
    private static List<Integer> missing(int[] nums) {
        int n = nums.length;
        List<Integer> list = new ArrayList<>();
        int[] temp = new int[n];
        
        for(int i = 0; i < n; i++)
            temp[nums[i]-1] = nums[i];
        
        for(int i = 0; i < n; i++)
            if(temp[i] == 0)
                list.add(i+1);
            
        return list;
    }

    //Method 2 - Optimal
    //Time complexity - O(n)
    //Space complexity - O(1)
    private static List<Integer> missingOptimal(int[] nums) {
        
        int n = nums.length;
        List<Integer> list = new ArrayList<>();
        
        int i = 0;
        while(i < n){
            if(nums[i] != nums[nums[i]-1])
                swap(nums, i, nums[i]-1);
            else
                i++;
        }
        for(int j = 0; j < n; j++)
            if(nums[j] != j+1)
                list.add(j+1);
            
        return list;
    }
    private static void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
