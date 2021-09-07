public class Last_Index_of_Number {

    // Method 1
    static int lastIndex(int[] arr, int x){
        int lastIndex = arr.length - 1;
        return lI(arr, x, lastIndex);
    }
    static int lI(int[] arr, int x, int lastIndex){
        if(lastIndex < 0) return -1;
        if(arr[lastIndex] == x) return lastIndex;
        return lI(arr, x, lastIndex - 1);
    }

    // Method 2
    static int last(int[] arr, int x, int length, int index){
        if(index == length) return -1;
        int smallAns = last(arr, x, length, index + 1);
        if(arr[index] == x && smallAns == -1)
            return index;
        else
            return smallAns;
    }
    public static void main(String[] args) {
        int arr[] = {6, 21, 4, 6, 54, 6, 4};
        int x = 6;
        int result = lastIndex(arr, x);
        System.out.println(result);
        int res = last(arr, x, arr.length, 0);
        System.out.println(res);
    }
}
