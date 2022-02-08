package Questions;

import java.util.*;

public class Kth_largest_Element {
    public static void main(String[] args) {
        int[] nums = { 10, 4, 7, 5, 8, 9, 6, 3, 1, 2 };
        int k = 3;
        int output = find1(nums, k);
        System.out.println(output);
        int output2 = find2(nums, k);
        System.out.println(output2);
    }

    private static int find1(int[] nums, int k) {
        Arrays.sort(nums);
        return nums[nums.length - k];
    }

    private static int find2(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int num : nums) {
            pq.offer(num);
            if (pq.size() > k) {
                pq.poll();
            }
        }
        return pq.poll();
    }
}
