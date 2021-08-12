package Questions;

public class All_Repeting_twice_Except_One {
    public static void main(String[] args) {
        int arr[] = { 25, 16, 2, 25, 16, 2, 11 };
        int ans = find(arr);
        System.out.println(ans);
    }

    private static int find(int[] arr) {
        int xor = arr[0];
        for (int i = 1; i < arr.length; i++) {
            xor = xor ^ arr[i];
        }
        return xor;
    }
}
