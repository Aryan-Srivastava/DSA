public class Next_Greater_Element_III {
    public static void main(String[] args) {
        int n = 6537421;
        int result = nextGreaterElement(n);
        System.out.println(result);
    }

    private static int nextGreaterElement(int n) {
        char[] arr = String.valueOf(n).toCharArray();
        // find first dip, element that is less than its right neighbor
        // 6 5 '3' 7 4 2 1
        int i = arr.length - 2;
        while (i >= 0 && arr[i] >= arr[i + 1])
            i--;
        // if no element is less than its right neighbor then i will point to -1
        if (i < 0)
            return -1;
        // find the element that is just greater than arr[i]
        // 6 5 3 7 '4' 2 1
        int j = arr.length - 1;
        while (arr[j] <= arr[i])
            j--;
        // swap 3 and 4 --> 6 5 '4' 7 '3' 2 1
        swap(arr, i, j);
        // reverse from i+1 to length-1 --> 6 5 4 "1 2 3 7"
        reverse(arr, i + 1, arr.length - 1);

        // result should not exceed the integer max value.
        long val = Long.parseLong(new String(arr));
        return (val <= Integer.MAX_VALUE) ? (int) val : -1;
    }

    private static void swap(char[] arr, int i, int j) {
        arr[i] ^= arr[j];
        arr[j] ^= arr[i];
        arr[i] ^= arr[j];
    }

    private static void reverse(char[] arr, int i, int j) {
        int l = i, r = j;
        while (l < r) {
            swap(arr, l++, r--);
        }
    }
}
