package Questions;

public class Sort_Array_By_Parity {
    public static void main(String[] args) {
        int[] arr = {3, 1, 2, 4};
        arr = sortArrayByParity2(arr);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    // Brute force
    
    // public static int[] sortArrayByParity(int[] A) {
    //     int[] arr = new int[A.length];
    //     int j = 0;
    //     for (int i = 0; i < A.length; i++) {
    //         if (A[i] % 2 == 0) {
    //             arr[j] = A[i];
    //             j++;
    //         }
    //     }
    //     for (int i = 0; i < A.length; i++) {
    //         if (A[i] % 2 != 0) {
    //             arr[j] = A[i];
    //             j++;
    //         }
    //     }
    //     return arr;
    // }

    //Better implementation
    public static int[] sortArrayByParity2(int[] nums) {
        int i = 0, j = nums.length - 1;
        while(i < j) {
            if(nums[i] % 2 == 0) {
                i++;
            } else {
                // if odd on right, find even
                if(nums[j] % 2 != 0) {
                    j--;
                }
                // if even on right
                if(nums[j] % 2 == 0) {
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                    i++;
                    j--;
                }
            }
        }
        return nums;
    }
}
