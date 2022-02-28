package Array_Queue;

import java.util.Arrays;

public class ArrayQueue {
    private int front, back;
    private int[] item;
    private int count;

    public ArrayQueue(int capacity) {
        this.front = 0;
        this.back = 0;
        item = new int[capacity];
    }

    private void DoubleCapacity() {
        int[] newArray = new int[item.length * 2];
        for (int i = 0; i < item.length; i++) {
            newArray[i] = item[i];
        }
        item = newArray;
    }

    public void enqueue(int data) {
        if (count == item.length) {
            DoubleCapacity();
        }
        item[back++] = data;
        count++;
    }

    public int dequeue() {
        if (count == 0) {
            throw new IllegalStateException("Queue is empty");
        }
        int data = item[front];
        item[front++] = 0;
        count--;
        return data;
    }

    @Override
    public String toString() {
        var temp = Arrays.copyOfRange(item, front, back);
        return Arrays.toString(temp);
    }
}