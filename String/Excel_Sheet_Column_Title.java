public class Excel_Sheet_Column_Title {
    public static void main(String[] args) {
        int cn = 701;
        System.out.println(convertToTitle(cn));
    }

    private static String convertToTitle(int cn) {
        StringBuilder sb = new StringBuilder();
        while (cn > 0) {
            cn--;
            int rem = cn % 26;
            char ch = (char) (65 + rem);
            sb.insert(0, ch);
            cn = cn / 26;
        }
        return sb.toString();
    }
}
