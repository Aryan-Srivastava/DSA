package Questions;

import java.util.*;

public class Find_All_Duplicates {
    public static void main(String[] args) {
        int[] arr = {4, 3, 2, 7, 8, 2, 3, 1};
        List<Integer> ans = findDuplicates2(arr);
        System.out.println(ans);
    }

    //Brute force solution -

    // private static ArrayList<Integer> findDuplicates(int[] arr) {
    //     int n = arr.length;
    //     ArrayList<Integer> list = new ArrayList<>();
    //     int[] freq = new int[n];
    //     for(int i = 0; i < n; i++){
    //         freq[arr[i]-1]++;
    //     }
    //     for(int i = 0; i < n; i++){
    //         if(freq[i] > 1)
    //             list.add(i+1);
    //     }
    //     return list;
    // }

    //Optimal solution -
    
    private static List<Integer> findDuplicates2(int[] nums) {
        int n = nums.length;
        List<Integer> list = new ArrayList<>();
        int i = 0;
        while(i < n){
            if(nums[i] != nums[nums[i]-1])
                swap(nums, i, nums[i]-1);
            else
                i++;
        }
        for(int j = 0; j < n; j++){
            if(nums[j] != j+1)
                list.add(nums[j]);
        }
        return list;
    }
    
    private static void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
