public class Check_If_Two_String_Arrays_are_Equivalent {
    public static void main(String[] args) {
        String[] word1 = { "a","bc"};
        String[] word2 = { "ab","c"};
        System.out.println(areEquivalent1(word1, word2));
        System.out.println(areEquivalent2(word1, word2));
    }

    private static boolean areEquivalent1(String[] word1, String[] word2) {
        return String.join("", word1).equals(String.join("", word2));
    }

    private static boolean areEquivalent2(String[] word1, String[] word2) {
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        for(int i = 0; i < word1.length; i++) {
            sb1.append(word1[i]);
        }
        for(int i = 0; i < word2.length; i++) {
            sb2.append(word2[i]);
        }
        String s1 = sb1.toString();
        String s2 = sb2.toString();
        return s1.equals(s2);
    }
}
