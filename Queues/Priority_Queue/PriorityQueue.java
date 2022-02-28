package Priority_Queue;

import java.util.Arrays;

public class PriorityQueue {
    private int[] items = new int[5];
    private int count = 0;
    private int first = 0;

    private void resize() {
        int[] newItems = new int[items.length * 2];
        for (int i = 0; i < items.length; i++) {
            newItems[i] = items[i];
        }
        items = newItems;
    }

    public void add(int item) {
        if (count == items.length)
            resize();
        int i = shiftItems(item);
        items[i + 1] = item;
        count++;
    }

    private int shiftItems(int item) {
        int i;
        for (i = count - 1; i >= 0; i--) {
            if (item < items[i]) {
                items[i + 1] = items[i];
            } else {
                break;
            }
        }
        return i;
    }

    public int remove() {
        if (isEmpty())
            throw new IllegalStateException();
        count--;
        return items[first++];
    }

    public boolean isEmpty() {
        return count == 0;
    }

    @Override
    public String toString() {
        int[] temp = Arrays.copyOfRange(items, first, count);
        return Arrays.toString(temp);
    }
}
