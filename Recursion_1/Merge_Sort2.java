public class Merge_Sort2 {

    static void merge(int[] arr, int start, int end) {
        int size = end - start + 1;
        int mid = (start + end) / 2;
        int output[] = new int[size];
        int i = start, j = mid + 1;
        int k = 0;
        while (i <= mid && j <= end) {
            if (arr[i] < arr[j]) {
                output[k] = arr[i];
                k++;
                i++;
            } else {
                output[k] = arr[j];
                k++;
                j++;
            }
        }
        while (i <= mid) {
            output[k] = arr[i];
            k++;
            i++;
        }
        while (j <= end) {
            output[k] = arr[j];
            k++;
            j++;
        }
        int m = 0;
        for (k = start; k <= end; k++)
            arr[k] = output[m++];
    }

    static void sort(int[] arr, int start, int end) {
        if (start >= end)
            return;
        int mid = (start + end) / 2;
        sort(arr, start, mid);
        sort(arr, mid + 1, end);
        merge(arr, start, end);
    }

    public static void main(String[] args) {
        int arr[] = { 8, 9, 7, 6, 4, 2, 1, 5 };
        sort(arr, 0, arr.length - 1);
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
    }
}
