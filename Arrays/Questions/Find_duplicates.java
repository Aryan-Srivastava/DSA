package Questions;

public class Find_duplicates {
    public static void main(String[] args) {
        int arr[] = { 2, 4, 3, 1, 5, 2 };
        find(arr);
    }

    private static void find(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int j = Math.abs(arr[i]);
            if (arr[j] >= 0)
                arr[j] = -arr[j];
            else
                System.out.print(j + " ");
        }
    }
}
