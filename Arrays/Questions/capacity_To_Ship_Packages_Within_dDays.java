package Questions;

import java.util.Arrays;
import java.util.stream.IntStream;

public class capacity_To_Ship_Packages_Within_dDays {
    public static void main(String[] args) {
        int[] weights = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int days = 5;
        System.out.println(findMin(weights, days));
    }

    private static int findMin(int[] weights, int days) {
        int right = IntStream.of(weights).sum(); // sum
        int left = Arrays.stream(weights).max().getAsInt(); // max
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (canShip(weights, mid, days)) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }

    private static boolean canShip(int[] weights, int mid, int days) {
        int need = 1, curr = 0;
        for (int w : weights) {
            curr += w;
            if (curr > mid) {
                need++;
                curr = w;
            }
            if(need > days)
                return false;
        }
        return true;
    }
}
