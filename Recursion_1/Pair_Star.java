public class Pair_Star {

    private static String solve(String s) {
        String ans = "";
        
        if(s.length() <= 1) return s;

        String smallAns = solve(s.substring(1));

        if(s.charAt(0) == smallAns.charAt(0))
            ans = s.charAt(0) + "*" + s.charAt(1) + smallAns.substring(1);
        else
            ans = s.charAt(0) + smallAns;
        return ans;
    }

    public static void main(String[] args) {
        String s = "aaaba";
        String ans = solve(s);
        System.out.println(ans);
    }
}
