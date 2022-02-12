public class Valid_Palindrome_II {
    public static void main(String[] args) {
        String s = "abca";
        System.out.println(isPalindrome(s));
    }

    private static boolean isPalindrome(String s) {
        int i = 0, j = s.length() - 1;
        while (i <= j) {
            if (s.charAt(i) != s.charAt(j)) {
                return pal(s, i + 1, j) || pal(s, i, j - 1);
            }
            i++;
            j--;
        }
        return true;
    }

    private static boolean pal(String s, int start, int end) {
        while (start <= end) {
            if (s.charAt(start) != s.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}
