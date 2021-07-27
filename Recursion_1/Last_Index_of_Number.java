public class Last_Index_of_Number {

    static int lastIndex(int[] arr, int x){
        int startIndex = arr.length - 1;
        return lI(arr, x ,startIndex);
    }
    static int lI(int[] arr, int x, int startIndex){
        if(startIndex < 0) return -1;
        if(arr[startIndex] == x) return startIndex;
        return lI(arr, x, startIndex - 1);
    }
    public static void main(String[] args) {
        int arr[] = {6, 21, 4, 6, 54, 6, 4};
        int x = 6;
        int result = lastIndex(arr, x);
        System.out.println(result);
    }
}
