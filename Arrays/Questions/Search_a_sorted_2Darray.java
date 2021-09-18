package Questions;

//74 - Leetcode - https://leetcode.com/problems/search-a-2d-matrix/

public class Search_a_sorted_2Darray {
    public static void main(String[] args) {
        int[][] matrix = { { 1, 3, 5, 7 },
                           { 10, 11, 16, 20 },
                           { 23, 30, 34, 60 } };
        int target = 16;
        System.out.println(searchMatrix(matrix, target));
    }

    public static boolean searchMatrix(int[][] matrix, int target) {
        for (int[] i : matrix) {
            boolean isPresent = isPresent(i, target);
            if (isPresent)
                return true;
        }
        return false;
    }

    private static boolean isPresent(int[] arr, int target) {
        int start = 0, end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target)
                return true;
            else if (arr[mid] < target)
                start = mid + 1;
            else
                end = mid - 1;
        }
        return false;
    }
}
