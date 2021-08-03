package Questions;

public class Find_max_and_min_element {
    public static void main(String[] args) {
        int arr[] = {10, 5, 2, 11, 2, 1, 7, 0};
        find(arr);
    }

    private static void find(int[] arr) {
        int max = arr[0], min = arr[0];
        for(int i = 1; i < arr.length; i++) {
            if(arr[i] > max)
                max = arr[i];
            if(arr[i] < min)
                min = arr[i];
        }
        System.out.println("max = " + max + "\nmin = " + min);
    }
}
// Time complexity - O(n)
// O(log n) if binary search is used.