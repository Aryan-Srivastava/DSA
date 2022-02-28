package QueueUsingStack;

public class MainClass {
    public static void main(String[] args) {
        StackQueue queue = new StackQueue();
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.dequeue();
        System.out.println(queue.dequeue());
        System.out.println(queue.peek());
    }
}
