package idv.carl.sorting;

import java.util.Arrays;

/**
 * @author Carl Lu
 */
public class QuickSort2 {

    public static void main(String args[]) {
        QuickSort2 quickSort = new QuickSort2();
        int[] input = new int[] {3, 5, 4, 8, 7, 90, 80, 88};
        quickSort.quickSort(input, 0, input.length - 1);
        Arrays.stream(input).forEach(data -> System.out.print(data + " "));
    }

    // Here we just take the left node as pivot
    public void quickSort(int[] data, int left, int right) {
        if (left < right) {
            int leftIndex = left;
            int rightIndex = right + 1;

            while (true) {
                while ((leftIndex + 1) < data.length && data[++leftIndex] < data[left]);

                while ((rightIndex - 1) > -1 && data[--rightIndex] > data[left]);

                if (leftIndex >= rightIndex) {
                    break;
                }

                swap(data, leftIndex, rightIndex);
            }

            swap(data, left, rightIndex);
            quickSort(data, left, rightIndex - 1);
            quickSort(data, rightIndex + 1, right);
        }
    }

    private void swap(int[] data, int pos1, int pos2) {
        int tmp = data[pos1];
        data[pos1] = data[pos2];
        data[pos2] = tmp;
    }

}
