package Questions;

import java.util.Scanner;

public class Check_if_a_key_is_present_in_every_segment_of_size_k_in_an_array {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i <n; i++)
            arr[i] = sc.nextInt();

        int k = sc.nextInt();
        int x = sc.nextInt();

        for(int i = 0; i <n; i+=k){
            for(int j = i; j < k; j++){
                if(arr[j] == x){
                    
                }
            }
        }
        sc.close();
    }
}
