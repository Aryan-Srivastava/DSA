package Array_Queue;

public class MainClass {
    public static void main(String[] args) {
        ArrayQueue queue = new ArrayQueue(3);
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);

        int first = queue.dequeue();
        System.out.println(first);
        System.out.println(queue);
    }
}