public class isSortedArray {

    //ascending order
    static boolean isSorted(int[] a){
        if(a.length <= 1) return true;

        if(a[0] > a[1]) return false;

        int[] smallArr = new int[a.length - 1];
        for(int i = 1; i < a.length; i++){
            smallArr[i-1] = a[i];
        }
        boolean smallAns = isSorted(smallArr);
        return smallAns;

    }

    //better approach
    static boolean isSorted_2(int[] a, int startIndex){
        if(startIndex >= a.length) return true;
        if(a[startIndex] > a[startIndex+1]) return false;

        return isSorted_2(a, startIndex + 1);
    }
    public static void main(String[] args) {
        int[] arr = {5, 2, 5, 10, 11};
        // System.out.println(isSorted(arr));
        System.out.println(isSorted_2(arr, 0));
    }
}
