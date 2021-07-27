public class Replace_Characters {

    static String rep(String s, char c1, char c2) {
        if(s.length() < 1) return "";
        char c;
        
        if(s.charAt(0) == c1) 
            c = c2;
        else 
            c = s.charAt(0);
        
        String ans = rep(s.substring(1), c1, c2);
        return c + ans;
    }
    public static void main(String[] args) {
        String input = "Hey there we are coding in java";
        char c1 = 'e', c2 = 'a';
        String output = rep(input, c1, c2);
        System.out.println(output);
    }
}
