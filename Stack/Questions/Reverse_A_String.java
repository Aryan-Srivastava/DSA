package Questions;

import java.util.Stack;

public class Reverse_A_String {
    public static void main(String[] args) {
        String s = "abcde";
        Stack<Character> stack = new Stack<>();
        for(int i = 0; i < s.length(); i++)
            stack.push(s.charAt(i));
        for(int i = 0; i < s.length(); i++)
            System.out.print(stack.pop());
    }
}
