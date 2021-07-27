public class Merge_Sort {

    static void sort(int[] arr, int start ,int mid , int end){
        int first = mid - start + 1;
        int second = end - mid;
        int[] firstArray = new int[first];
        int[] secondArray = new int[second];
        
        for(int i = 0; i < first; i++)
            firstArray[i] = arr[start + i];
        
        for(int i = 0; i < second; i++)
            secondArray[i] = arr[mid + 1 + i];
        int i = 0;
        int j = 0;
        int k = start;
        while(i < first && j < second){
            if(firstArray[i] < secondArray[j]){
                arr[k] = firstArray[i];
                i++;
            }else{
                arr[k] = secondArray[j];
                j++;
            }
            k++;
        }

        while(i < first){
            arr[k] = firstArray[i];
            i++; k++;
        }
        while(j < second){
            arr[k] = secondArray[j];
            j++; k++;
        }
    }
    
    static void mergeSort(int[] arr, int start, int end){
        if(start > end) return;
        if(start < end){
            int mid = (start + end) / 2;
            mergeSort(arr, start, mid);
            mergeSort(arr, mid + 1, end);
            sort(arr, start, mid, end);
        }
    }
    public static void main(String[] args) {
        int[] arr = {5, 4 , 3, 2, 1, 7, 9, 11, 10, 6, 8};
        int length = arr.length;
        mergeSort(arr, 0, length - 1);
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
// Time Complexity : O(n log n)
// Space Complexity : O(n)
