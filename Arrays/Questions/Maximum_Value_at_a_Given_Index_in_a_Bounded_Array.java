package Questions;

// leetcode 1802 - https://leetcode.com/problems/maximum-value-at-a-given-index-in-a-bounded-array/

public class Maximum_Value_at_a_Given_Index_in_a_Bounded_Array {
    public static void main(String[] args) {
        int n = 4, index = 2, maxSum = 6;
        System.out.println(maxValue(n, index, maxSum));
    }

    private static int maxValue(int n, int index, int maxSum) {
        long left = index, right = n - index - 1;
        long start = 1, end = maxSum;
        while (start <= end) {
            long mid = start + (end - start) / 2;
            long m = mid - 1;
            long leftSum = 0, rightSum = 0;
            if (m >= left) {
                long notInRange = m - left;
                leftSum = (m * (m + 1) / 2) - (notInRange * (notInRange + 1) / 2);
            } else {
                long emptySpacesLeft = left - m;
                leftSum = (m * (m + 1) / 2) + 1 * emptySpacesLeft;
            }
            if (m >= right) {
                long notInRange = m - right;
                rightSum = (m * (m + 1) / 2) - (notInRange * (notInRange + 1) / 2);
            } else {
                long emptySpacesLeft = right - m;
                rightSum = (m * (m + 1) / 2) + 1 * emptySpacesLeft;
            }
            long sum = leftSum + rightSum + mid;
            if (sum > maxSum) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return (int) end;
    }
}