package idv.carl.datastructures.heaptree;

/**
 * @author Carl Lu
 */
public class MinHeap {

    private final static int FRONT = 1;
    private int[] heap;
    private int size;
    private int maxsize;

    public MinHeap(int maxsize) {
        this.maxsize = maxsize;
        this.size = 0;
        heap = new int[this.maxsize + 1];
        heap[0] = Integer.MIN_VALUE;
    }

    public static void main(String args[]) {
        System.out.println("The Min Heap is: ");
        MinHeap minHeap = new MinHeap(30);
        minHeap.insert(33);
        minHeap.insert(28);
        minHeap.insert(19);
        minHeap.insert(11);
        minHeap.insert(2);
        minHeap.insert(17);
        minHeap.insert(22);
        minHeap.insert(24);
        minHeap.insert(15);
        minHeap.insert(4);
        minHeap.insert(5);
        minHeap.insert(7);
        minHeap.insert(31);

        minHeap.minHeap();
        minHeap.print();
        System.out.println("The min value of the heap is: " + minHeap.remove());
    }

    private int parent(int position) {
        return position / 2;
    }

    private int left(int position) {
        return (2 * position);
    }

    private int right(int position) {
        return (2 * position) + 1;
    }

    private boolean isLeaf(int position) {
        return ((position >= size / 2) && position <= size);
    }

    private void swap(int pos1, int pos2) {
        int temp = heap[pos1];
        heap[pos1] = heap[pos2];
        heap[pos2] = temp;
    }

    private void minHeapify(int pos) {
        if (!isLeaf(pos)) {
            if ((heap[pos] > heap[left(pos)]) || (heap[pos] > heap[right(pos)])) {
                if (heap[left(pos)] < heap[right(pos)]) {
                    swap(pos, left(pos));
                    minHeapify(left(pos));
                } else {
                    swap(pos, right(pos));
                    minHeapify(right(pos));
                }
            }
        }
    }

    public void insert(int element) {
        heap[++size] = element;
        int current = size;

        while (heap[current] < heap[parent(current)]) {
            swap(current, parent(current));
            current = parent(current);
        }
    }

    public void print() {
        for (int i = 1; i <= size / 2; i++) {
            System.out.print(" PARENT : " + heap[i] + " LEFT CHILD : " + heap[2 * i] + " RIGHT CHILD :" + heap[2 * i + 1]);
            System.out.println();
        }
    }

    public void minHeap() {
        for (int pos = (size / 2); pos >= 1; pos--) {
            minHeapify(pos);
        }
    }

    public int remove() {
        int popped = heap[FRONT];
        heap[FRONT] = heap[size--];
        minHeapify(FRONT);
        return popped;
    }

}
