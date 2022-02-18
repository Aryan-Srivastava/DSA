public class Swap_Adjacent_In_LR_String {
    public static void main(String[] args) {
        String s = "RXXLRXRXL";
        String e = "XRLXXRRLX";
        System.out.println(swapAdjacentInLRString(s, e));
    }

    private static boolean swapAdjacentInLRString(String s, String e) {
        if(s.length() != e.length()) return false;
        int i = 0, j = 0;
        char[] st = s.toCharArray();
        char[] ed = e.toCharArray();
        while(i < st.length || j < ed.length) {
            while(i < st.length && st[i] == 'X'){
                ++i;
            }
            while(j < ed.length && ed[j] == 'X') {
                ++j;
            }
            // both at end
            if(i == st.length && j == ed.length) {
                return true;
            }
            // one of them at the end
            if(i == st.length || j == ed.length) {
                return false;
            }
            if(st[i] != ed[j]) return false;
            if(st[i] == 'R' && i > j) return false;
            if(st[i] == 'L' && i < j) return false;
            i++;
            j++;
        }
        return true;
    }
}
