public class Sorting_the_Sentence {

    public static void main(String[] args) {
        String s = "is2 sentence4 This1 a3";
        String ans = sortSentence(s);
        System.out.println(ans);
    }

    private static String sortSentence(String s) {
        String[] words = s.split(" "); // Split the string around spaces - {"is2","sentence4","This1","a3"}
        String[] ans = new String[words.length]; // creates an array of strings of size of words.length
        for (String word : words) { // iterate through the words array
            // get the last index of a word in the array words, i.e., 2, 4, 1, 3.
            int index = word.length() - 1;
            // place the word in the ans array at the index of the last character of the
            // word. i.e., ans[2] = "is"
            ans[word.charAt(index) - '1'] = word.substring(0, index);
        }
        // return the array of strings in the ans array after joining them together with
        // spaces separated.
        return String.join(" ", ans);
    }
}