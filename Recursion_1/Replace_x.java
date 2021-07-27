public class Replace_x {

    static String replaceX(String s){
        String ans = "";
        if(s.length() < 1) return s;
        String smallAns = replaceX(s.substring(1));
        if(s.charAt(0) != 'x') ans = ans + s.charAt(0);
        return ans + smallAns;
    }
    public static void main(String[] args) {
        String s = "xdxdxd";
        String result = replaceX(s);
        System.out.println(result);
    }
}
