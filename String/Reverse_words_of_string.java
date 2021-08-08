public class Reverse_words_of_string {
    public static void main(String[] args) {
        String str = "the syk is blue";
        char ch[] = str.toCharArray();
        split(ch);
        System.out.println(ch);
    }

    private static void split(char[] ch) {
        int k = 0;
        for(int i = 0; i < ch.length; i++) {
            if(ch[i] == ' ') {
                reverse(ch,k,i-1);
                k = i+1;
            }
        }
        reverse(ch, k, ch.length-1);
        reverse(ch,0,ch.length-1);
    }

    private static void reverse(char[] ch, int k, int i) {
        while(k <= i){
            char temp = ch[k];
            ch[k] = ch[i];
            ch[i] = temp;
            k++; i--;
        }
    }
    
}
