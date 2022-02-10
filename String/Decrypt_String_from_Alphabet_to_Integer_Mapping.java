public class Decrypt_String_from_Alphabet_to_Integer_Mapping {
    public static void main(String[] args) {
        String s = "10#11#12";
        System.out.println(freqAlphabets(s));
    }

    private static String freqAlphabets(String s) {
        StringBuilder sb = new StringBuilder();
        int n = s.length();
        for (int i = 0; i < n;) {
            if (i + 2 < n && s.charAt(i + 2) == '#') {
                // int num = Integer.parseInt(s.substring(i, i + 2));
                // char ch = (char) (96 + num);
                int ch1 = (s.charAt(i) - '0') * 10;
                int ch2 = (s.charAt(i + 1) - '0');
                char ch = (char) ('a' - 1 + ch1 + ch2);
                sb.append(ch);
                i += 3;
            } else {
                char ch = (char) ('a' + s.charAt(i) - '1');
                sb.append(ch);
                i++;
            }
        }
        return sb.toString();
    }
}
