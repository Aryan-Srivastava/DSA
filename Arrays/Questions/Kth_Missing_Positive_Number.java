package Questions;

public class Kth_Missing_Positive_Number {
    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 7, 11};
        System.out.println( "Using Linear search - "+ find1(arr, 5));
        System.out.println("Using Binary Search - " + find2(arr, 5));
    }

    private static int find1(int[] arr, int k) {
        for(int i : arr) {
            if(i <= k)
                k++;
            else
                break;
        }
        return k;
    }

    private static int find2(int[] arr, int k) {
        int start = 0, end = arr.length;
        while(start < end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] - 1 - mid < k) {
                start = mid + 1;
            }else{
                end = mid;
            }
        }
        return start + k;
    }
}
