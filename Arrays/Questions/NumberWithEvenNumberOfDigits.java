package Questions;

public class NumberWithEvenNumberOfDigits {
    public static void main(String[] args) {
        int[] arr = {12, 345, 2, 6, 7896};
        int ans = findNumbers(arr);
        System.out.println(ans);
    }

    private static int findNumbers(int[] nums) {
        int MainCount = 0;
        for(int i = 0; i < nums.length; i++){
            int num = nums[i];
            int count = 0; 
            while(num != 0){
                count++;
                num = num / 10;
            }
            if(count%2 == 0)
                MainCount++;
        }
        return MainCount;
    }
}
