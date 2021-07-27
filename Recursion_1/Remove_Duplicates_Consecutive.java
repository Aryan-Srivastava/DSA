public class Remove_Duplicates_Consecutive {

    static String remove(String s){
        if(s.length() <= 1) return s;
        if(s.charAt(0) == s.charAt(1))
            return remove(s.substring(1));
        else
            return s.charAt(0) + remove(s.substring(1));
    }
    public static void main(String[] args) {
        String s = "abcbbaddd";
        String out = remove(s);
        System.out.println(out);
    }
}