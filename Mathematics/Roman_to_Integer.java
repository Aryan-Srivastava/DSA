public class Roman_to_Integer {
    public static void main(String[] args) {
        String s = "MXIV";
        int ans = romanToInt(s);
        System.out.println(ans);
    }
    private static int romanToInt(String s) {
        int ans = 0;
        int prev = getVal(s.charAt(0));
        for(int i = 1; i < s.length(); i++){
            int cur = getVal(s.charAt(i));
            if(prev < cur)
                ans -= prev;
            else
                ans += prev;
            prev = cur;
        }
        ans += prev;
        return ans;
    }
    private static int getVal(char ch){
        if(ch == 'I')
            return 1;
        else if(ch == 'V')
            return 5;
        else if(ch == 'X')
            return 10;
        else if(ch == 'L')
            return 50;
        else if(ch == 'C')
            return 100;
        else if(ch == 'D')
            return 500;
        else if(ch == 'M')
            return 1000;
        else
            return 0;
    }
}
