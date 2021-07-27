public class First_Index_of_Number {
    
    //finding first index of number
    static int firstIndex(int[] arr, int x){
        return fI(arr, x, 0);
    }
    static int fI(int[] arr,int x, int index){
        if(index > arr.length) return -1;
        if(arr[index] == x) return index;
        return fI(arr, x, index+1);
    }
    public static void main(String[] args) {
        int[] arr = {1, 6, 84, 21, 64, 54, 7, 6, 54, 9, 10};
        int x = 10;
        int ans = firstIndex(arr, x);
        System.out.println(ans);
    }
}
