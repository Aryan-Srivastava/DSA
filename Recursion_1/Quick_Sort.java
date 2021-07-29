public class Quick_Sort {

    private static int partition(int[] arr, int start , int end){
        int pivot = arr[start];
        int count = 0;
        for(int i = start + 1; i <= end; i++){
            if(arr[i] <= pivot)
                count++;
        }
        int pivotIndex = start + count;
        arr[start] = arr[pivotIndex];
        arr[pivotIndex] = pivot;

        int j = start, k = end;
        while(j < pivotIndex && k > pivotIndex){
            if(arr[j] <= pivot) j++;
            else if(arr[k] > pivot) k--;
            else{
                int temp = arr[j];
                arr[j] = arr[k];
                arr[k] = temp;
                j++; k--;
            }
        }
        return pivotIndex;
    }
    
    static void sort(int[] arr, int start , int end){
        if(start >= end) return;
        int pivot = partition(arr, start, end);
        sort(arr, start, pivot-1);
        sort(arr, pivot+1, end);
    }
    
    public static void main(String[] args) {
        int arr[] = {5, 6, 1, 10, 2, 5, 3, 4};
        sort(arr, 0, arr.length - 1);
        for(int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
    }
}