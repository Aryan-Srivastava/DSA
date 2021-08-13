package Questions;

// import java.util.Arrays;
// import java.util.HashMap;

public class Find_Missing_and_Repeating_Num {
    public static void main(String[] args) {
        int arr[] = { 5, 4, 1, 2, 1 };
        find(arr);
    }

    private static void find(int[] arr){
        int xor = 0;
        for(int i = 0; i < arr.length; i++){
            xor ^= arr[i];
        }
        for(int i = 1; i <= arr.length; i++){
            xor ^= i;
        }
        int rmsb = xor & -xor;
        int x = 0, y = 0;
        for(int i = 0; i < arr.length; i++){
            if((arr[i] & rmsb) == 0){
                x = x ^ arr[i];
            }else{
                y = y ^ arr[i];
            }
        }
        for(int i = 1; i <= arr.length; i++){
            if((i & rmsb) == 0){
                x = x ^ i;
            }else{
                y = y ^ i;
            }
        }
        for(int i : arr){
            if(i == x){
                System.out.println("missing = " + y + "\nDuplicate = " + x);
                break;
            }else if(i == y){
                System.out.println("missing = " + x + "\nDuplicate = " + y);
                break;
            }
        }
    }
    
    // private static void find(int[] arr) {
    //     // Repeting
    //     for(int i = 0; i < arr.length; i++){
    //         int j = Math.abs(arr[i])-1;
    //         if(arr[j] > 0){
    //             arr[j] = -arr[j];
    //         }else{
    //             System.out.print(Math.abs(arr[i]) + " ");
    //             break;
    //         }
    //     }
    //     // missing
    //     for(int i = 0; i < arr.length; i++){
    //         if(arr[i] > 0){
    //             System.out.print(i+1);
    //             break;
    //         }
    //     }
    // }
    
    // private static void find(int[] arr) {
    //     int[] freq = new int[arr.length + 1];
    //     for(int i = 0; i < arr.length; i++){
    //         freq[arr[i]]++;
    //     }
    //     for(int i = 1; i < freq.length; i++){
    //         if(freq[i] == 0)
    //             System.out.println(i + " = Missing.");
    //         else if(freq[i] == 2)
    //             System.out.println(i + " = Repeting.");
    //     }
    // }

    // private static void find(int[] arr) {
    //     HashMap<Integer,String> hash = new HashMap<>();
    //     int freq[] = new int[arr.length+1];
    //     Arrays.fill(freq, 0);
    //     for(int i = 0; i < arr.length; i++){
    //         freq[arr[i]]++;
    //     }
    //     for(int i = 1; i < freq.length; i++){
    //         if(freq[i] == 0)
    //             hash.put(i,"Missing");
    //         else if(freq[i] == 2)
    //             hash.put(i,"Repeating");
    //     }
    //     System.out.println(hash);
    // }

}