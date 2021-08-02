package Questions;

public class No_of_rotation_made_in_sorted_array {

    private static int count(int arr[]){
        if(arr.length <= 1) return 0;
        int count = 1;
        for(int i = 0; i < arr.length - 1; i++){
            if(arr[i] < arr[i+1])
                count++;
            else
                break;
        }
        return arr.length - count;
    }
    public static void main(String[] args) {
        int arr[] = {3, 4, 5, 6, 7, 1, 2};
        int c = count(arr);
        System.out.println(c);
    }
}
