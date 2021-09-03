package Questions;

public class RemoveDuplicatesFromSortedArray {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 3, 3, 3, 3};
        int ans = remove(arr);
        System.out.println(ans);
    }

    //returning number of elements left after removing duplicate
    private static int remove(int[] arr) {
        int count = 0, n = arr.length;
        // Count for counting the number of duplicate elements
        //[1, 2, 3, 3, 3, 3, 3]
        //                   ^
        //                   i
        // when i reaches last duplicate elementof that particular number then according to the else statement
        // arr[i - count] where, count = 4 and i = 6, arr[2] = arr[6]
        // finally arr = [1, 2, 3, 0, 0, 0, 0]
        // (returning num of elements in array - num of duplicate elements)
        for(int i = 1; i < n; i++){
            if(arr[i] == arr[i-1]) count++;
            else arr[i - count] = arr[i];
        }
        return n-count;
    }
}