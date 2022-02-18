
import java.util.Stack;

public class Basic_Calculator_II {
    public static void main(String[] args) {
        String s = "3+2*2";
        System.out.println(calculate(s));
        System.out.println(calculate2(s));
    }

    //Using stack
    private static int calculate(String str) {
        if (str.length() == 0 || str == null)
            return 0;
        Stack<Integer> s = new Stack<>();
        int n = str.length();
        int curr = 0;
        char op = '+';
        char[] ch = str.toCharArray();
        
        for (int i = 0; i < n; i++) {
            if (Character.isDigit(ch[i])) {
                curr = curr * 10 + ch[i] - '0';
            }
            if (!Character.isDigit(ch[i]) && ch[i] != ' ' || i == n - 1) {
                if (op == '+') {
                    s.push(curr);
                } else if (op == '-') {
                    s.push(-curr);
                } else if (op == '*') {
                    s.push(s.pop() * curr);
                } else if (op == '/') {
                    s.push(s.pop() / curr);
                }
                op = ch[i];
                curr = 0;
            }
        }
        int sum = 0;
        while (!s.isEmpty()) {
            sum += s.pop();
        }
        return sum;
    }


    // Without using stack 
    private static int calculate2(String str) {
        if (str.length() == 0 || str == null)
            return 0;
        int n = str.length();
        int curr = 0, last = 0, sum = 0;
        char op = '+';
        char[] ch = str.toCharArray();
        
        for (int i = 0; i < n; i++) {
            if (Character.isDigit(ch[i])) {
                curr = curr * 10 + ch[i] - '0';
            }
            if (!Character.isDigit(ch[i]) && ch[i] != ' ' || i == n - 1) {
                if (op == '+') {
                    sum += last;
                    last = curr;
                } else if (op == '-') {
                    sum += last;
                    last = -curr;
                } else if (op == '*') {
                    last = last * curr;
                } else if (op == '/') {
                    last = last / curr;
                }
                op = ch[i];
                curr = 0;
            }
        }
        sum += last;
        return sum;
    }
}
