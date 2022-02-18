public class Multiply_Strings {
    public static void main(String[] args) {
        String s = "2";
        String e = "6";
        System.out.println(multiplyStrings(s, e));
    }

    public static String multiplyStrings(String num1, String num2) {

        int m = num1.length(), n = num2.length();
        int[] arr = new int[m + n];
        int i = n - 1;
        int pf = 0; // powerfactor

        while (i >= 0) {
            int ival = num2.charAt(i) - '0';

            int carry = 0;
            int j = m - 1;
            int k = arr.length - 1 - pf;

            while (j >= 0 || carry != 0) {
                int jval = j >= 0 ? num1.charAt(j) - '0' : 0;
                int product = ival * jval + carry + arr[k];
                arr[k] = product % 10;
                carry = product / 10;
                j--;
                k--;
            }

            i--;
            pf++;
        }

        StringBuilder sb = new StringBuilder();
        boolean flag = false;
        for (int x = 0; x < arr.length; x++) {
            if (arr[x] == 0 && flag == false) {
                continue;
            } else {
                flag = true;
                sb.append(arr[x]);
            }
        }

        return sb.toString() == "" ? "0" : sb.toString();
    }
}
