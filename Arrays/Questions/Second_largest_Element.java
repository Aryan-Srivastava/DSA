package Questions;

public class Second_largest_Element {
    public static void main(String[] args) {
        int arr[] = {2, 13, 4, 1, 3, 6, 28};
        int answer = second(arr, arr.length);
        System.out.println(answer);
    }
 
    private static int second(int[] arr, int n) {
        if(n <= 1) return Integer.MIN_VALUE;
        int temp = 0, max = Integer.MIN_VALUE;

        for(int i = 0; i < n; i++){
            if(arr[i] > max){
                temp = max;
                max = arr[i];
            }
            else if(arr[i] > temp && arr[i] != max)
                temp = arr[i];
        }
        return temp;
    }
}
