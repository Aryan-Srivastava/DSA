package Questions;

import java.util.Arrays;

public class FirstAndLastPositionOfElementInSortedArray {
    public static void main(String[] args) {
        int[] arr = { 5, 7, 7, 8, 8, 10 };
        int target = 8;
        System.out.println(Arrays.toString(find(arr, target)));
        System.out.println(Arrays.toString(Search(arr, target)));
    }

    // Naive approach - O(n) time complexity
    private static int[] find(int[] arr, int target) {
        int n = arr.length;
        int[] temp = new int[2];
        Arrays.fill(temp, -1);
        boolean flag = false;
        int count = 0, last = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == target) {
                last = i;
                count++;
                flag = true;
            }
        }
        if (flag) {
            int first = last - count + 1;
            temp[0] = first;
            temp[1] = last;
        }
        return temp;

    }

    // Better approach - O(log n) time complexity( using Binary Serach )
    private static int[] Search(int[] arr, int target) {
        int[] temp = { -1, -1 };
        temp[0] = binarySearch(arr, target, true);
        if (temp[0] != -1) {
            temp[1] = binarySearch(arr, target, false);
        }
        return temp;
    }

    private static int binarySearch(int[] arr, int target, boolean isLowerBound) {

        int start = 0, end = arr.length - 1, result = -1;

        while (start <= end) {

            int mid = start + (end - start) / 2;
            if (arr[mid] > target)
                end = mid - 1;
            else if (arr[mid] < target)
                start = mid + 1;
            else {
                result = mid;
                if (isLowerBound)
                    end = mid - 1;
                else
                    start = mid + 1;
            }
        }
        return result;
    }
}
