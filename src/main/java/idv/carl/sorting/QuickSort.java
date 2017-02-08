package idv.carl.sorting;

import java.util.Arrays;

/**
 * @author Carl Lu
 */
public class QuickSort {

    public static void main(String args[]) {
        QuickSort quickSort = new QuickSort();
        int[] input = new int[] {3, 5, 4, 8, 7, 90, 80, 88};
        quickSort.quickSort(input, 0, input.length - 1);
        Arrays.stream(input).forEach(data -> System.out.print(data + " "));
    }

    public void quickSort(int[] data, int left, int right) {
        // Terminate condition:
        // The data size in each term, it should grater than three so quick sort can work.
        int size = right - left + 1;
        if (size <= 3) {
            // If the data size is less than three, sort manually and return.
            manualSort(data, left, right);
            return;
        }

        // Step1. Decide the proper pivot value
        int pivot = obtainPivot(data, left, right);
        // Step2. Partitioning according to the pivot
        int partitionIndex = partition(data, left, right, pivot);
        // Step3. Quick sort for left
        quickSort(data, left, partitionIndex - 1);
        // Step4. Quick sort for right
        quickSort(data, partitionIndex + 1, right);
    }

    private int partition(int[] data, int left, int right, int pivot) {
        // Step1. Define two index to indicate the two positions
        int leftIndex = left;
        int rightIndex = right - 1;

        // Step2. Partition,
        while (true) {
            // Left side: Search a value that is grater than the pivot from left to right, then stop
            while (data[++leftIndex] < pivot) {
                // Do nothing.
            }

            // Right side: Search a value that is less than the pivot from right to left, then stop
            while (data[--rightIndex] > pivot) {
                // Do nothing.
            }

            if (leftIndex >= rightIndex) {
                break;
            } else {
                swap(data, leftIndex, rightIndex);
            }
        }

        // Step3. Put the pivot to the partition position
        swap(data, leftIndex, right - 1);

        return leftIndex;
    }

    private int obtainPivot(int[] data, int left, int right) {
        int center = (left + right) >> 1;
        if (data[left] > data[center]) {
            swap(data, left, center);
        }
        if (data[left] > data[right]) {
            swap(data, left, right);
        }
        if (data[center] > data[right]) {
            swap(data, center, right);
        }
        // Sorting locally.
        swap(data, center, right - 1);
        return data[right - 1];
    }

    private void swap(int[] data, int pos1, int pos2) {
        int tmp = data[pos1];
        data[pos1] = data[pos2];
        data[pos2] = tmp;
    }

    private void manualSort(int[] data, int left, int right) {
        int size = (right - left) + 1;
        if (size == 1) {
            return;
        } else if (size == 2) {
            if (data[left] > data[right]) {
                swap(data, left, right);
            }
        } else if (size == 3) {
            if (data[left] > data[right - 1]) {
                swap(data, left, right - 1);
            }
            if (data[left] > data[right]) {
                swap(data, left, right);
            }
            if (data[right - 1] > data[right]) {
                swap(data, right - 1, right);
            }
        }

    }

}
