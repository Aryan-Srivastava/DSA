public class Max_Num_Of_Removable_Chars {
    // 1898. https://leetcode.com/problems/maximum-number-of-removable-characters/
    public static void main(String[] args) {
        String s = "abcacb";
        String p = "ab";
        int[] removable = { 3, 1, 0 };
        System.out.println(maxNumOfRemovableChars(s, p, removable));
    }

    private static int maxNumOfRemovableChars(String s, String p, int[] removable) {
        char[] ch = s.toCharArray();
        int l = 0, r = removable.length;
        while (l <= r) {
            int mid = l + (r - l) / 2;
            for (int i = 0; i < mid; i++) {
                ch[removable[i]] = '-';
            }
            if (check(ch, p))
                l = mid + 1;
            else {
                for (int i = 0; i < mid; i++) {
                    ch[removable[i]] = s.charAt(removable[i]);
                }
                r = mid - 1;
            }
        }
        return r;
    }

    private static boolean check(char[] ch, String p) {
        int i = 0, j = 0;
        while (i < ch.length && j < p.length()) {
            char ch1 = ch[i], ch2 = p.charAt(j);
            if (ch1 != '-' && ch1 == ch2)
                j++;
            i++;
        }
        return j == p.length();
    }
}
