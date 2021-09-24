package Questions;

public class Single_Element_In_Sorted_Array {
    public static void main(String[] args) {
        int[] nums = { 1, 1, 2, 3, 3, 4, 4, 8, 8 };
        int soloElement = findSingle1(nums);
        System.out.println(soloElement);
        System.out.println(findSingle2(nums));
    }

    //Method 1 
    private static int findSingle1(int[] nums) {
        int xor = 0;
        for(int i : nums)
            xor ^= i;
        return xor;
    }

    //Method 2 
    private static int findSingle2(int[] nums) {
        int low = 0, high = nums.length - 2;
        while(low <= high){
            int mid = low + ((high - low) >> 1);
            if(nums[mid] == nums[mid ^ 1])
                low  = mid + 1;
            else
                high = mid - 1;
        }
        return nums[low];
    }
}

// Brute approach -

// use XOR property, which cancels out the similar element and you will be left with just 1 non repeting element.
//   public int singleNonDuplicate(int[] nums) {
//       int xor = 0;
//       for(int i : nums)
//           xor ^= i;
//       return xor;
//   }


// Optimal approach -

// The intution here is -
// The first occurence of the repeting element wil always be at EVEN index.
// And the second occurence is always be at ODD index.
// So, if the current index(mid) is ODD then we have to compare it with mid-1 and
// if is similar then go to right side if not go to left side.
// We've to do the very same thing with EVEN index too,
// but here we are going to compare it with mid+1 because we know that 1st occurence always be at even and sec one at odd index,
// so if number at mid == number at mid+1 then search in right half otherwise left half.

// To avoid multiple if-else statement we're using one of the XOR property here which is -
// If we XOR any odd element with 1, it'll give us thatElement-1.
// If we XOR any even element with 1, it'll give us thatElement-1.
// We know that different bits will be 1 and similar bits will be zero when we XOR two values.

// Example -

//         ( 3 ^ 1 ) --> 2

//         3 --> 0 1 1
//                 ^ 1
//               ------
//               0 1 0 --> 2
//         ( 2 ^ 1 ) --> 3

//         2 --> 0 1 0
//                 ^ 1
//               ------
//               0 1 1 --> 3

// So when we're doing if(nums[mid] == nums[mid^1]) we're automatically checking the odd and even case.