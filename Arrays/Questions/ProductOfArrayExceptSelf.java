package Questions;

public class ProductOfArrayExceptSelf {
    public static void main(String[] args) {
        int[] arr = {-1, 1, 0, -3, 3};
        int[] ans = product(arr);
        for(int i : ans)
            System.out.print(i + " ");
    }

    private static int[] product(int[] nums) {
        // Naive approach - might give TLE
        // int n = nums.length;
        // int[] temp = new int[n];
        // for(int i = 0;i < n; i++){
        //     int mul = 1;
        //     for(int j = 0; j < n; j++){
        //         if(i == j) continue;
        //         mul = mul * nums[j];
        //     }
        //     temp[i] = mul;
        // }
        // return temp;

        //Better approach
        int n = nums.length;
        int[] temp = new int[n];
        temp[0] = 1;
        for(int i = 1; i < n; i++) {
            temp[i] = temp[i-1] * nums[i-1];
        }
        int right = 1;
        for(int i = n -1; i >= 0; i--) {
            temp[i] *= right;
            right *= nums[i];
        }
        return temp;
    }
}
