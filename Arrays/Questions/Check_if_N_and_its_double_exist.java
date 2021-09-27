package Questions;

import java.util.*;

public class Check_if_N_and_its_double_exist {
    public static void main(String[] args) {
        int[] arr = { -2, 0, 10, -19, 4, 6, -8 };
        System.out.println(findIfExists1(arr));
        System.out.println(findIfExists2(arr));
        System.out.println(findIfExists3(arr));
    }

    //Brute - O(N^2)
    private static boolean findIfExists1(int[] arr) {
        for(int i  = 0; i < arr.length; i++) {
            for(int j = arr.length - 1; j >= 0; j--) {
                if(i != j) {
                    if(2 * arr[i] == arr[j]) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    //better - TC - O(N), SC - O(N)
    private static boolean findIfExists2(int[] arr) {
        Set<Integer> seen = new HashSet<Integer>();
        for(int num : arr) {
            // Don't check num/2 if the number is odd
            if (num % 2 == 0 && seen.contains(num / 2)) {
                return true;
            }
            // Check num*2 for even and odd
            if (seen.contains(num * 2)) {
               return true;
            }
            seen.add(num);
        }
        return false;
    }

    // Optimal - TC - O(nlogn) - Not recommended as it is modifing the input data
    private static boolean findIfExists3(int[] arr) {
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++){
            if(Arrays.binarySearch(arr,2*arr[i])>=0){
                if(Arrays.binarySearch(arr,2*arr[i]) !=i) {
                    return true;
                }
            }
        }
        return false;
    }

}
