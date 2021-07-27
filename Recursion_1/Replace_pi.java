public class Replace_pi {

    static String replace(String s) {
        String ans = "";
        if(s.length() <= 1) return s;

        String smallAns = replace(s.substring(1));

        if(s.charAt(0) == 'p' && smallAns.charAt(0) == 'i') 
            ans = "3.14" + smallAns.substring(1);
        else 
            ans = s.charAt(0) + smallAns;
        return ans;
    }

    public static void main(String[] args) {
        String s = "sipspi";
        String result = replace(s);
        System.out.println(result);
    }
}