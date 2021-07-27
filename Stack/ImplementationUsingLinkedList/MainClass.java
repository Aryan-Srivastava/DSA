package ImplementationUsingLinkedList;

public class MainClass {
    public static void main(String[] args) {
        StackUsingLL<Character> stack = new StackUsingLL<>();
        
        stack.push('a');
        stack.push('b');
        stack.push('c');
        stack.push('d');
        stack.push('e');

        System.out.println(stack.isEmpty());
        var peek = stack.peek();
        System.out.println(peek);
        System.out.println(stack.size());
        System.out.println(stack.pop());
        System.out.println(stack.peek());
        stack.pop();
        stack.pop();
        System.out.println(stack.peek());
    }
}
