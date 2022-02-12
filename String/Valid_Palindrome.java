public class Valid_Palindrome {
    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        System.out.println(isPalindrome(s));
    }

    private static boolean isPalindrome(String s) {
        int start = 0, end = s.length() - 1;
        char c1, c2;
        while (start < end) {
            c1 = s.charAt(start);
            c2 = s.charAt(end);
            if (!Character.isLetterOrDigit(c1)) {
                start++;
            } else if (!Character.isLetterOrDigit(c2)) {
                end--;
            } else {
                if (Character.toLowerCase(c1) != Character.toLowerCase(c2)) {
                    return false;
                }
                start++;
                end--;
            }
        }
        return true;
    }
}
