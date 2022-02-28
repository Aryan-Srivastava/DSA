package QueueUsingStack;

import java.util.Stack;

public class StackQueue {

    Stack<Integer> s1 = new Stack<>();
    Stack<Integer> s2 = new Stack<>();

    public void enqueue(int data) {
        s1.push(data);
    }

    public int dequeue() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        moveStack1ToStack2();
        return s2.pop();
    }

    public boolean isEmpty() {
        return s1.empty() && s2.empty();
    }

    public int peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        moveStack1ToStack2();
        return s2.peek();
    }

    private void moveStack1ToStack2() {
        if (s2.isEmpty()) {
            while (!s1.isEmpty()) {
                s2.push(s1.pop());
            }
        }
    }
}
