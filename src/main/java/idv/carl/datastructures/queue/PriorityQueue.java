package idv.carl.datastructures.queue;

/**
 * @author Carl Lu
 */
public class PriorityQueue {

    private int[] queue;

    // Number of elements in this queue
    private int elementCount;

    public PriorityQueue(int length) {
        queue = new int[length];
        elementCount = 0;
    }

    public void insert(int element) {
        if (elementCount == queue.length) {
            return;
        } else if (elementCount == 0) {
            queue[elementCount] = element;
        } else {
            /*
             * If the queue is not empty, execute sorting before insert the element
             */
            int i;
            for (i = elementCount - 1; i >= 0; i--) {
                if (element > queue[i]) {
                    queue[i + 1] = queue[i];
                } else {
                    break;
                }
            }
            /*
             * Since we use i-- in the for loop on line 28,
             * so here we need to add 1 for the index i.
             */
            queue[i + 1] = element;
        }
        elementCount++;
    }

    public int remove() {
        if (elementCount == 0) {
            return 0;
        }
        // Decrease the elementCount because it already be increased at the end of insert.
        elementCount--;
        // Remove the last element
        int removed = queue[elementCount];
        // Assume that 0 means the data was removed
        queue[elementCount] = 0;
        return removed;
    }

    public int peek() {
        return queue[elementCount - 1];
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
