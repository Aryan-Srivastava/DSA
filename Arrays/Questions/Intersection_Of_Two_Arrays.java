package Questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class Intersection_Of_Two_Arrays {
    public static void main(String[] args) {
        int[] nums1 = { 4, 9, 5 };
        int[] nums2 = { 9, 4, 9, 8, 4 };
        System.out.println(Arrays.toString(intersection(nums1, nums2)));
        System.out.println(Arrays.toString(intersection2(nums1, nums2)));
        System.out.println(Arrays.toString(intersection3(nums1, nums2)));
        System.out.println(Arrays.toString(intersection4(nums1, nums2)));
        System.out.println(intersection5(nums1, nums2));
    }

    private static int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> intersection = new HashSet<>();

        for (int i : nums1)
            set.add(i);

        for (int i : nums2)
            if (set.contains(i))
                intersection.add(i);

        int[] result = new int[intersection.size()];
        int i = 0;
        for (Integer num : intersection)
            result[i++] = num;
        return result;
    }

    private static int[] intersection2(int[] nums1, int[] nums2) {
        HashSet<Integer> hash1 = new HashSet<>();
        HashSet<Integer> hash2 = new HashSet<>();
        for (int i : nums1)
            hash1.add(i);
        for (int i : nums2)
            hash2.add(i);
        hash1.retainAll(hash2);
        int[] result = new int[hash1.size()];
        int index = 0;
        for (int i : hash1)
            result[index++] = i;
        return result;
    }

    private static int[] intersection3(int[] nums1, int[] nums2) {
        Set<Integer> set = Arrays.stream(nums2).boxed().collect(Collectors.toSet());
        return Arrays.stream(nums1).distinct().filter(e -> set.contains(e)).toArray();
    }

    private static int[] intersection4(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int i = 0, j = 0, index = 0;
        int[] intersection = new int[Math.min(nums1.length,nums2.length)];
        while (i < nums1.length && j < nums2.length) {
            int left = nums1[i], right = nums2[j];
            if(left == right){
                intersection[index++] = right;
                while(i < nums1.length && left == nums1[i])
                    i++;
                while(j < nums2.length && right == nums2[j])
                    j++;
            }
            else if(right > left)
                while(i < nums1.length && left == nums1[i])
                    i++;
            else
                while(j < nums2.length && right == nums2[j])
                    j++;
        }
        return Arrays.copyOf(intersection,index);
    }

    private static ArrayList<Integer> intersection5(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<>();
        for (int i : nums1)
            set.add(i);
        ArrayList<Integer> result = new ArrayList<>();
        for (int i : nums2) {
            if (set.contains(i)) {
                result.add(i);
                set.remove(i);
            }
        }
        return result;
    }
}