public class Max_Repeating_Substring {
    public static void main(String[] args) {
        String seq = "aaa";
        String w = "a";
        System.out.println(maxRepeatingSubstring(seq, w));
    }

    private static int maxRepeatingSubstring(String seq, String w) {
        int ans = 0;
        while (seq.contains(w.repeat(ans)))
            ++ans;
        return ans - 1;
    }
}
