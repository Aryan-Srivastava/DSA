package Questions;

public class RemoveElement {
    public static void main(String[] args) {
        int[] arr = {2, 3, 3, 2};
        int target = 3;
        System.out.println(removeElement(arr, target));
    }

    private static int removeElement(int[] nums, int val) {
        int count = 0;
        for(int i = 0; i < nums.length; i++)
            if(nums[i] != val)
                nums[count++] = nums[i];
        return count;
    }
}
