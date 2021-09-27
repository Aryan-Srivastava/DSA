package Questions;

import java.util.stream.IntStream;
import java.util.Arrays;
import java.util.HashSet;

public class Fair_Candy_Swaps {
    public static void main(String[] args) {
        int[] aliceSize = { 1, 2, 5 };
        int[] bobSize = { 2, 4 };
        int[] ans = findSwaps2(aliceSize, bobSize);
        System.out.println(Arrays.toString(ans));
    }

    private static int[] findSwaps2(int[] aliceSize, int[] bobSize) {
        int sumAlice = IntStream.of(aliceSize).sum();
        int sumBob = IntStream.of(bobSize).sum();
        int diff = (sumAlice - sumBob) / 2;
        HashSet<Integer> set = new HashSet<>();
        for (int i : aliceSize)
            set.add(i);
        for (int j : bobSize)
            if (set.contains(j + diff))
                return new int[] { j, j + diff };
        return null;
    }
}
