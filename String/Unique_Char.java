public class Unique_Char {
    public static void main(String[] args) {
        String s = "aryan";
        System.out.println(isUnique(s));
    }

    private static boolean isUnique(String s) {
        if(s.length() > 128)
            return false;
        boolean[] char_set = new boolean[128];
        for(int i = 0; i < s.length(); i++){
            char currentVal = s.charAt(i);
            if(char_set[currentVal])
                return false;
            char_set[currentVal] = true;
        }
        return true;
    }
}
