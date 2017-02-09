package idv.carl.datastructures.queue;

/**
 * @author Carl Lu
 */
public class CircularQueue {
    private int[] queue;
    private int head;
    private int tail;

    // Number of elements in this queue
    private int elementCount;

    public CircularQueue(int length) {
        queue = new int[length];
        head = 0;
        tail = -1;
        elementCount = 0;
    }

    public void insert(int element) {
        // Check the tail index already exceed the max length or not
        if (tail == queue.length - 1) {
            tail = -1;
        }
        tail++;
        queue[tail] = element;
        elementCount++;

        if (elementCount > queue.length) {
            elementCount = queue.length;
        }
    }

    public int remove() {
        if (elementCount == 0) {
            return 0;
        }
        int temp = queue[head];
        queue[head] = 0;
        // Check the head index already exceed the max length or not
        if (head == queue.length - 1) {
            /*
             * If the removed node is tail, it means that the next node will be removed must be the
             * head node since this is a circular queue, so reset head index to 0.
             */
            head = 0;
        } else {
            head++;
        }
        elementCount--;
        return temp;
    }

    public int peek() {
        return queue[head];
    }

    public boolean isEmpty() {
        return elementCount == 0;
    }

    public boolean isFull() {
        return elementCount == queue.length;
    }

    public int getElementCount() {
        return elementCount;
    }

}
