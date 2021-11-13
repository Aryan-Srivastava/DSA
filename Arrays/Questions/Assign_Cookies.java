package Questions;

import java.util.Arrays;

public class Assign_Cookies {
    public static void main(String[] args) {
        int g[] = {1, 2, 3};
        int s[] = {1, 1};
        int result = findContentChildren(g, s);
        System.out.println(result);
    }

    public static int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int i = 0, j = 0;
        int count = 0;
        while (i < g.length && j < s.length) {
            if (g[i] <= s[j]) {
                count++;
                i++;
                j++;
            } else {
                j++;
            }
        }
        return count;
    }
}
