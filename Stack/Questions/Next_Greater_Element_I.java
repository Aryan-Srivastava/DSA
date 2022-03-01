package Questions;

import java.util.*;

public class Next_Greater_Element_I {
    public static void main(String[] args) {
        int[] nums1 = { 1, 3, 5, 2, 4 };
        int[] nums2 = { 6, 5, 4, 3, 2, 1, 7 };
        int[] result = nextGreaterElement(nums1, nums2);
        System.out.println(result.toString());
    }

    private static int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] result = new int[nums1.length];
        Map<Integer, Integer> map = new HashMap<>();
        Stack<Integer> stack = new Stack<>();
        for (int num : nums2) {
            while (!stack.isEmpty() && num > stack.peek()) {
                map.put(stack.pop(), num);
            }
            stack.push(num);
        }
        int i = 0;
        for (int num : nums1) {
            result[i++] = map.getOrDefault(num, -1);
        }
        return result;
    }
}
