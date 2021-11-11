import java.util.Arrays;

public class reverse {

    public static void main(String[] args) {
        String s = "I am Aryan sri";
        rev(s);
    }

    private static void rev(String s) {
        int i = 0, j = s.length() - 1;
        char[] arr = s.toCharArray();
        while (i < j) {
            if(arr[i] == ' ') {
                i++;
            }
            char temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
        }
         Arrays.toString(arr);
         System.out.println(arr);
    }
}