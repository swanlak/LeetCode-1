package idv.carl.datastructures.heaptree;

import java.util.Arrays;

/**
 * @author Carl Lu
 */
public class MaxHeap {

    private int[] data;

    public MaxHeap(int[] data) {
        this.data = data;
    }

    public static void main(String args[]) {
        int[] arr = new int[] {3, 5, 3, 0, 8, 6, 1, 5, 8, 6, 2, 4, 9, 4, 7, 0, 1, 8, 9, 7, 3, 1, 2, 5, 9, 7, 4, 0, 2, 6};
        new MaxHeap(arr).sort();
        System.out.println(Arrays.toString(arr));
    }

    /*
     * The core method of heapsort, include two steps.
     */
    public void sort() {
        /*
         * Step1. Transform the array into a max heap.
         * beginIndex: The first one non-leaf node
         *
         * Remember that we don't need to start from the last leaf node,
         * just start from the first one non-leaf node.
         *
         * Since we can see a leaf node as a qualified node, the root node is itself.
         */
        int len = data.length - 1;
        int beginIndex = ( len - 1 ) >> 1;
        for (int i = beginIndex; i >= 0; i--) {
            maxHeapify(i, len);
        }

        /*
         * Step2. To sort the max heap.
         *
         * Every iteration we swap the root node with the last leaf node.
         * Then, max-heapify from the new root node to (length -1), until the length of non-sorted
         * heap is 0.
         */
        for (int i = len; i > 0; i--) {
            swap(0, i);
            maxHeapify(0, i - 1);
        }
    }

    private void swap(int i, int j) {
        int temp = data[i];
        data[i] = data[j];
        data[j] = temp;
    }

    private void maxHeapify(int index, int len) {
        /*
         * index of left node, (index * 2) + 1
         * index of right node, left index + 1
         * max index of the successor, by default, it's left node
         */
        int left = ( index << 1 ) + 1;
        int right = left + 1;
        int maxSuccessor = left;

        // left index exceed the length.
        if (left > len) {
            return;
        }

        // To choose the bigger one from the two nodes.
        if (right <= len && data[right] > data[left]) {
            maxSuccessor = right;
        }

        /*
         * If the parent was swapped, it means that we need to apply max-heapify on it to ensure
         * it's still valid to be a max heap.
         */
        if (data[maxSuccessor] > data[index]) {
            swap(maxSuccessor, index);
            maxHeapify(maxSuccessor, len);
        }
    }

}
