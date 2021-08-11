package Questions;

public class Second_Smallest_Element {
    public static void main(String[] args) {
        int arr[] = { 5, 10, 1, 65, 5, 3 };
        int ans = find(arr);
        System.out.println(ans);
    }

    private static int find(int[] arr) {
        int second = 0, min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] <= min) {
                second = min;
                min = arr[i];
            } else if (arr[i] < second && arr[i] != min) {
                second = arr[i];
            }
        }
        return second;
    }
}
