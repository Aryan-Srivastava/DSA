import java.util.Arrays;
import java.util.Hashtable;

public class Anagram {

    public static void main(String[] args) {
        String s1 = "garden";
        String s2 = "danger";
        System.out.println(isAnagram(s1, s2));
        System.out.println(isAnagramUsingHashtable(s1, s2));
    }

    //using sort function
    private static boolean isAnagram(String s1, String s2) {
        if(s1.length() != s2.length())
            return false;
        char[] s1Array = s1.toCharArray();
        char[] s2Array = s2.toCharArray();
        Arrays.sort(s1Array);
        Arrays.sort(s2Array);
        if (Arrays.equals(s1Array, s2Array)) {
            return true;
        }
        return false;
    }

    //isAnagram using hashtable
    private static boolean isAnagramUsingHashtable(String s1, String s2) {
        if(s1.length() != s2.length())
            return false;
        Hashtable<Character, Integer> h1 = new Hashtable<>();
        for(int i = 0; i < s1.length(); i++) {
            if(h1.containsKey(s1.charAt(i))) {
                int count = (int)h1.get(s1.charAt(i));
                h1.put(s1.charAt(i), count + 1);
            } else {
                h1.put(s1.charAt(i), 1);
            }
        }
        Hashtable<Character, Integer> h2 = new Hashtable<>();
        for(int i = 0; i < s2.length(); i++) {
            if(h2.containsKey(s2.charAt(i))) {
                int count = (int)h2.get(s2.charAt(i));
                h2.put(s2.charAt(i), count + 1);
            } else {
                h2.put(s2.charAt(i), 1);
            }
        }
        if(h1.equals(h2)) {
            return true;
        }
        return false;
    }
    
}