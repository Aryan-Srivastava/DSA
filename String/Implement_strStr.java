public class Implement_strStr {
    public static void main(String[] args) {
        String haystack = "hello";
        String needle = "ll";
        System.out.println(strStr(haystack, needle));
    }

    private static int strStr(String haystack, String needle) {
        if (needle.length() <= 0)
            return 0;
        int l1 = haystack.length();
        int l2 = needle.length();
        for (int i = 0; i < l1; i++) {
            int count = 0;
            while (i + l2 <= l1 &&
                    count < l2 &&
                    haystack.charAt(i + count) == needle.charAt(count)) {
                count++;
            }
            if (count == l2) {
                return i;
            }
        }
        return -1;
    }
}