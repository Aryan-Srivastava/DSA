package Questions;

import java.util.*;

public class Sliding_Window_Maximum {
    public static void main(String[] args) {
        int[] nums = { 1, 3, -1, -3, 5, 3, 6, 7 };
        int k = 3;
        int[] result = maxSlidingWindow(nums, k);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }

    private static int[] maxSlidingWindow(int[] nums, int k) {
        Deque<Integer> dq = new ArrayDeque<>();
        int[] ans = new int[nums.length - k + 1];
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            // if statement, so that deque size doesn't exceed by k
            if (!dq.isEmpty() && dq.peek() < i - k + 1)
                dq.poll();
            // if last added statement is less than current one then remove it,
            // so that highest element is always at the top
            while (!dq.isEmpty() && nums[dq.peekLast()] < nums[i])
                dq.pollLast();
            dq.offer(i);
            // if index exceed k then keep adding highest element in output array
            if (i >= k - 1)
                ans[index++] = nums[dq.peek()];
        }
        return ans;
    }

    // TLE - O(nk)
    // public static int[] maxSlidingWindow(int[] nums, int k) {
    //     PriorityQueue<Integer> pq = new PriorityQueue<Integer>(Collections.reverseOrder());
    //     List<Integer> list = new ArrayList<>();
    //     for (int i = 0; i < nums.length - k + 1; i++) {
    //         for (int j = i; j < i + k; j++) {
    //             pq.offer(nums[j]);
    //         }
    //         list.add(pq.poll());
    //         pq.clear();
    //     }
    //     return list.stream().mapToInt(i -> i).toArray();
    // }
}
