package Questions;

// import java.util.Arrays;
// import java.util.HashSet;

public class Find_duplicates {
    public static void main(String[] args) {
        int arr[] = {2, 5, 9, 6, 9, 3, 8, 9, 7, 1};
        int ans = find(arr);
        System.out.println(ans);
    }

    // Optimal method 1 - 
    // Hare and turtle method(Floyd's algorithm)
    // Time complexity - O()
    // Space complexity - O()

    private static int find(int[] arr) {
        int slow = arr[0];
        int fast = arr[0];

        do{
            slow = arr[slow];
            fast = arr[arr[fast]];
        }while(slow != fast);
        slow = arr[0];
        while(fast != slow){
            slow = arr[slow];
            fast = arr[fast];
        }
        return slow;
    }

    // Optimal solution 2 - 
    // Not recommended as it is modifing input array
    // Time complexity - O(N)
    // Space complexity - O(1)

    // private static int find(int[] arr) {
    //     for (int i = 0; i < arr.length; i++) {
    //         int j = Math.abs(arr[i]);
    //         if (arr[j] >= 0)
    //             arr[j] = -arr[j];
    //         else
    //             return j;
    //     }
    //     return 0;
    // }

    // Better approach -
    // Time complexity - O(n)
    // Space complexity - O(n)
    
    // private static int find(int[] arr) {
    //     HashSet<Integer> set = new HashSet<>();
    //     set.add(arr[0]);
    //     for(int i = 1; i < arr.length; i++) {
    //         if(set.contains(arr[i]))
    //             return arr[i];
    //         else
    //             set.add(arr[i]);
    //     }
    //     return 0;
    // }

    
    // Brute force approach -
    // Not recommended as it is modifing input array
    // Time complexity - O(NlogN)
    // Space complexity - O(1)

    // private static int find(int[] arr) {
    //     Arrays.sort(arr);
    //     for(int i = 0; i < arr.length - 1; i++){
    //         if(arr[i] == arr[i+1]){
    //             return arr[i];
    //         }
    //     }
    //     return 0;
    // }
}
