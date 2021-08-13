package Questions;

public class Find_Missing {
    public static void main(String[] args) {
        int arr[] = { 1, 6, 5, 4, 2 };
        int ans = find(arr, arr.length);
        System.out.println(ans);
    }

    private static int find(int[] a, int n) {
        int x1 = a[0], x2 = 0;
        for(int i = 1; i < n; i++) {
            x1 = x1 ^ a[i];
        }
        for(int i = 1; i <= n+1; i++){
            x2 = x2 ^ i;
        }
        return (x1 ^ x2);
    }

    // private static int find(int[] arr) {
    //     int xor = ((arr.length + 1) * (arr.length + 2)) / 2;
    //     int sum = 0;
    //     for (int i = 0; i < arr.length; i++) {
    //         sum = sum + arr[i];
    //     }
    //     return xor - sum;
    // }
}
