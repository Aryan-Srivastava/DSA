package Questions;

public class Second_largest_Element {
    public static void main(String[] args) {
        int arr[] = {2, 13, 4, 1, 3, 6, 28};
        int answer = second(arr, arr.length);
        System.out.println(answer);
    }
 
    private static int second(int[] arr, int n) {
        int second = 0, max = arr[0];

        for(int i = 1; i < n; i++){
            if(arr[i] > max){
                second = max;
                max = arr[i];
            }
            else if(arr[i] > second && arr[i] != max)
                second = arr[i];
        }
        return second;
    }
}
