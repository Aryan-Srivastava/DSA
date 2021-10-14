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
            int mid = left + (right - left) / 2, need = 1, curr = 0;
            need = canShip(weights, mid, need, curr);
            if (need > days) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return left;
    }

    private static int canShip(int[] weights, int mid, int need, int curr) {
        for (int w : weights) {
            if (curr + w > mid) {
                need++;
                curr = 0;
            }
            curr += w;
        }
        return need;
    }
}
