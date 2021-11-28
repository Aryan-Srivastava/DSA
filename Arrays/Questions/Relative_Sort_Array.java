package Questions;

import java.util.*;

public class Relative_Sort_Array {
    public static void main(String[] args) {
        int[] arr1 = { 2, 3, 1, 3, 2, 4, 6, 7, 9, 2, 19 };
        int[] arr2 = { 2, 1, 4, 3, 9, 6 };
        System.out.println(Arrays.toString(relativeSortArray(arr1, arr2)));
    }

    private static int[] relativeSortArray(int[] arr1, int[] arr2) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i : arr2) {
            map.put(i, 0);
        }
        for (int i = 0; i < arr1.length; i++) {
            if (map.containsKey(arr1[i])) {
                map.put(arr1[i], map.get(arr1[i]) + 1);
                arr1[i] = -1;
            }
        }
        Arrays.sort(arr1);
        int index = 0;
        for (int i : arr2) {
            int noOfEle = map.remove(i);
            while (noOfEle-- > 0) {
                arr1[index] = i;
                index++;
            }
        }
        return arr1;
    }
}
