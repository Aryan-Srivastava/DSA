public class Sentence_Similarity_III {
    public static void main(String[] args) {
        String s1 = "Hello World";
        String s2 = "World";
        System.out.println(similar(s1, s2));
    }

    private static boolean similar(String s1, String s2) {
        String[] w1 = s1.split(" ");
        String[] w2 = s2.split(" ");
        int n1 = w1.length, n2 = w2.length;
        if(n1 > n2) {
            return similar(s2, s1);
        }
        int i = 0;
        while(i < n1 && w1[i].equals(w2[i])) {
            ++i;
        }
        while(i < n1 && w1[i].equals(w2[n2-n1+i])) {
            ++i;
        }
        return i == n1;
    }
}