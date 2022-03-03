package Questions;

import java.util.Stack;

public class find132Pattern {
    public static void main(String[] args) {
        int[] nums = { 3, 1, 4, 2 };
        System.out.println(find132pattern(nums));
    }

    public static boolean find132pattern(int[] nums) {
        Stack<Integer> s = new Stack<>();
        int second = Integer.MIN_VALUE;
        for (int i = nums.length - 1; i >= 0; i--) {
            if (nums[i] < second)
                return true;
            while (!s.empty() && s.peek() < nums[i]) {
                second = s.pop();
            }
            s.push(nums[i]);
        }
        return false;
    }
}
