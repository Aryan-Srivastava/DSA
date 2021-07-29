public class String_to_Integer {

    private static int strToInt(String str){
        if(str.length() == 1) return str.charAt(0) - '0';
        int smallAns = strToInt(str.substring(0, str.length()-1));
        int nextDigit = str.charAt(str.length()-1) - '0';
        return smallAns*10 + nextDigit;
    }

    public static void main(String[] args) {
        String s = "10234";
        int i = strToInt(s);
        System.out.println(i);
    }
}