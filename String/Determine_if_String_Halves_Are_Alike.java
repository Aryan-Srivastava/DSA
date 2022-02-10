public class Determine_if_String_Halves_Are_Alike {
    public static void main(String[] args) {
        String s = "book";
        System.out.println(halfAlike(s));
    }

    private static boolean halfAlike(String s) {
        int i = 0, j = s.length() - 1;
        int ans = 0;
        while (i < j) {
            if (vowels(s.charAt(i))) {
                ans++;
            }
            if (vowels(s.charAt(j))) {
                ans--;
            }
            i++;
            j--;
        }
        return ans == 0;
    }

    private static boolean vowels(char ch) {
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'
                || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U';
    }
}
