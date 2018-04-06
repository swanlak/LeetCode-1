package idv.carl.sorting.quicksort;

/**
 * @author Carl Lu
 */
public class QuickSortByMiddlePivot {

    public static void sort(int[] data) {
        if (data == null || data.length == 0) {
            return;
        }
        quickSort(data, 0, data.length - 1);
    }

    private static void quickSort(int[] data, int leftBound, int rightBound) {
        int left = leftBound;
        int right = rightBound;

        int pivot = data[leftBound + ( rightBound - leftBound ) / 2];

        while (left < right) {
            while (data[left] < pivot) {
                left++;
            }

            while (data[right] > pivot) {
                right--;
            }

            if (left <= right) {
                swap(data, left, right);
                left++;
                right--;
            }
        }

        if (leftBound < right) {
            quickSort(data, leftBound, right);
        }

        if (left < rightBound) {
            quickSort(data, left, rightBound);
        }
    }

    private static void swap(int[] data, int left, int right) {
        int temp = data[left];
        data[left] = data[right];
        data[right] = temp;
    }

}
