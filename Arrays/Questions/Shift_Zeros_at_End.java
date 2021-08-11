package Questions;

public class Shift_Zeros_at_End {

    static void pushZerosToEnd(int arr[], int n) {
	    int count = arr.length - 1;
	    for(int i = arr.length - 1; i >= 0; i--){
	        if(arr[i] == 0){
	            int temp = arr[count];
	            arr[count] = arr[i];
	            arr[i] = temp;
	            count--;
	        }
	    }
	}
    public static void main(String[] args) {
        int arr[] = {9, 0, 0, 8, 2};
        pushZerosToEnd(arr, arr.length);
        for(int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
    }
}