public class Min_Len_of_String_After_Del_Similar_Ends {
    public static void main(String[] args) {
        String s = "aabccabba";
        System.out.println(minDelete(s));
    }

    private static int minDelete(String s) {
        int i = 0, j = s.length() - 1;
        while (i < j && s.charAt(i) == s.charAt(j)) {
            char ch = s.charAt(i);
            while (i <= j && s.charAt(i) == ch) {
                ++i;
            }
            while (i <= j && s.charAt(j) == ch) {
                --j;
            }
        }
        return j - i + 1;
    }
}
