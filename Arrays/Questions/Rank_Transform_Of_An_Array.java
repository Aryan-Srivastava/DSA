package Questions;

import java.util.*;

public class Rank_Transform_Of_An_Array {
    public static void main(String[] args) {
        int[] arr = { 40, 10, 20, 30 };
        System.out.println(Arrays.toString(rankTransform(arr)));
    }

    private static int[] rankTransform(int[] arr) {
        int[] h = Arrays.copyOf(arr, arr.length);
        Arrays.sort(h);
        Map<Integer, Integer> map = new HashMap<>();
        for (int i : h) {
            map.putIfAbsent(i, map.size() + 1);
        }
        for (int i = 0; i < arr.length; i++) {
            h[i] = map.get(arr[i]);
        }
        return h;
    }
}
