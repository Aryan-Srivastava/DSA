public class Sliding_Window_1 {
    public static void main(String[] args) {
        String s = "cabbage uses cab";
        String p = "cab";
        int LS = s.length(), LP = p.length();
        int i = 0, j = LP - 1;
        while (j < LS) {
            if (match(s, p, i, j)) {
                System.out.println(i);
            }
            i++;
            j++;
        }
    }

    private static boolean match(String s, String p, int i, int j) {
        for (int x = 0; x < p.length(); x++) {
            if (s.charAt(i + x) != p.charAt(x))
                return false;
        }
        return true;
    }
}