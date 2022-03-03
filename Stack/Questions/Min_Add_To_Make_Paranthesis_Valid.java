package Questions;

import java.util.Stack;

public class Min_Add_To_Make_Paranthesis_Valid {
    public static void main(String[] args) {
        String s = "())";
        System.out.println(minAddToMakeValid(s));
    }

    public static int minAddToMakeValid(String s) {
        Stack<Character> stack = new Stack<>();
        char open = '(';
        int need = 0;
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == open) {
                stack.push(open);
            } else {
                if(!stack.empty() && stack.peek() == open) {
                    stack.pop();
                } else {
                    need++;
                }
            }
        }
        return need+stack.size();
    }
}
