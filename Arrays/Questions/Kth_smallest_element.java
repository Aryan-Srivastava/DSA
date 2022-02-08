package Questions;

import java.util.*;

public class Kth_smallest_element {
    public static void main(String[] args) {
        int arr[] = { 10, 5, 4, 1, 6, 9, 2, 3, 7, 8 };
        int k = 6;
        int ans = find1(arr, k);
        int ans2 = find2(arr, k);
        System.out.println(ans);
        System.out.println(ans2);
    }

    private static int find1(int[] arr, int k) {
        Arrays.sort(arr);
        return arr[k-1];
    }

    private static int find2(int[] arr, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for (int num : arr) {
            pq.offer(num);
            if (pq.size() > k) {
                pq.poll();
            }
        }
        return pq.poll();
    }
}
