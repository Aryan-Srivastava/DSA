package Questions;

import java.util.*;

public class Intersection_Of_Two_Arrays_II {
    public static void main(String[] args) {
        int[] nums1 = { 1, 2, 2, 1 };
        int[] nums2 = { 2, 2 };
        System.out.println(Arrays.toString(intersect(nums1, nums2)));
        System.out.println(Arrays.toString(intersect2(nums1, nums2)));
    }

    //Brute
    private static int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int i = 0, j = 0, n = nums1.length, m = nums2.length;
        ArrayList<Integer> list = new ArrayList<>();
        while (i < n && j < m) {
            if (nums1[i] == nums2[j]) {
                list.add(nums1[i]);
                i++;
                j++;
            } else if (nums1[i] < nums2[j]) {
                i++;
            } else {
                j++;
            }
        }
        int[] ans = new int[list.size()];
        for (int index = 0; index < list.size(); index++) {
            ans[index] = list.get(index);
        }
        return ans;
    }

    //Better
    private static int[] intersect2(int[] nums1, int[] nums2){
        ArrayList<Integer> list = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums1.length; i++) {
            if(map.containsKey(nums1[i]))
                map.put(nums1[i], map.get(nums1[i])+1);
            else
                map.put(nums1[i], 1);
        }
    
        for(int i = 0; i < nums2.length; i++) {
            if(map.containsKey(nums2[i]) && map.get(nums2[i]) > 0) {
                list.add(nums2[i]);
                map.put(nums2[i], map.get(nums2[i])-1);
            }
        }
        int[] ans = new int[list.size()];
        int index = 0;
        for(int i : list){
            ans[index++] = i;
        }
        return ans;
    }
}
