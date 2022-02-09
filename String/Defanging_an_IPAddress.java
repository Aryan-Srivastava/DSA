public class Defanging_an_IPAddress {
    public static void main(String[] args) {
        String s = "1.1.1.1";
        System.out.println(defangIPaddr(s));
    }

    private static String defangIPaddr(String s) {
        StringBuilder sb = new StringBuilder(s);
        for(int i = 0; i < sb.length(); i++){
            if(sb.charAt(i) == '.'){
                sb.replace(i,i+1, "[.]");
                i++;
            }
        }
        return sb.toString();
    }
}
