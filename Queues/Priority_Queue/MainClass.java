package Priority_Queue;

public class MainClass {
    public static void main(String[] args) {
        PriorityQueue queue = new PriorityQueue();
        queue.add(5);
        queue.add(2);
        queue.add(3);
        queue.add(5);
        System.out.println(queue.isEmpty());
        System.out.println(queue);
        while (!queue.isEmpty()) {
            System.out.println(queue.remove());
        }
    }
}
