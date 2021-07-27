package Questions;

import java.util.Stack;

public class Balanced_Paranthesis {
    public static void main(String[] args) {
        String str = "{(<<<1]+[2>>>)}";
        boolean flag = Expression(str);
        System.out.println(flag);
    }

    public static boolean Expression(String str) {
        Stack<Character> stack = new Stack<>();
        for(char ch : str.toCharArray()){
            if(leftBrackets(ch))
                stack.push(ch);
            if(rightBrackets(ch)){
                if(stack.empty())
                    return false;
                char top = stack.pop();
                if(bracketMatch(ch, top)){
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

    static boolean leftBrackets(char ch){
        return ch == '(' || ch == '{' || ch == '<' || ch == '[';
    }

    static boolean rightBrackets(char ch){
        return ch == ')' || ch == '}' || ch == '<' || ch == ']';
    }

    public static boolean bracketMatch(char ch, char top){
        return (ch == ')' && top != '(') || 
               (ch == ']' && top != '[') || 
               (ch == '}' && top != '{') || 
               (ch == '>' && top != '<');
    }
}
