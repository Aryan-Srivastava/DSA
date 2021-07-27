import java.util.Stack;

public class Reverse_Stack {

    // public static Stack<Integer> reverse(Stack<Integer> s1, Stack<Integer> s2){
    //     while(!s1.isEmpty())
    //         s2.push(s1.pop());
    //     s1 = s2;
    //     return s1;
    // }

    public static void reverse(Stack<Integer> s1, Stack<Integer> s2){
        if(s1.size() <= 1) return;
        int lastElement = s1.pop();
        reverse(s1, s2);
        while(!s1.isEmpty()){
            s2.push(s1.pop());
        }
        s1.push(lastElement);
        while(!s2.isEmpty()){
            s1.push(s2.pop());
        }
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        Stack<Integer> s1 = new Stack<>();
        Stack<Integer> s2 = new Stack<>();

        for(int elem : arr)
            s1.push(elem);
        reverse(s1, s2);
        System.out.println(s1);
    }
}