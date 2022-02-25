public class Find_Kth_Bit_in_Nth_Binary_String {

    public static void main(String[] args) {
        int n = 4;
        int k = 11;
        System.out.println(findKthBit(n, k));
    }

    public static char findKthBit(int n, int k) {
        if (k == 1)
            return '0';
        String ans = find(n);
        return ans.charAt(k - 1);
    }

    private static String find(int n) {
        if (n == 1)
            return "0";
        // goto till 1 using recursion
        String s = find(n - 1);
        // now add 1
        String ans = s + '1';
        // use stringbuilder for optimization purpose(as strings are immutable)
        StringBuilder sb = new StringBuilder();
        // traverse throught string s
        for (int i = 0; i < s.length(); i++) {
            // inverse part (if character is 1 add 0 else 1)
            if (s.charAt(i) == '1') {
                sb.append('0');
            } else {
                sb.append('1');
            }
        }
        // return s + '1' + reverse(inverse(s))
        return ans + sb.reverse().toString();
    }
}