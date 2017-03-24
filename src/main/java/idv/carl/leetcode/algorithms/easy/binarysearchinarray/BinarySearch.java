package idv.carl.leetcode.algorithms.easy.binarysearchinarray;

/**
 * @author Carl Lu
 */
public class BinarySearch {

    public static int searchRecursively(int[] input, int key, int from, int to) {
        if (from > to) {
            return -1;
        }

        /*
         * int mid = (from + to) >> 1;
         * 
         * It also works, however,
         * except when (from + to) produces int overflow.
         */
        int mid = from + ((to - from) >> 1);

        if (input[mid] > key) {
            return searchRecursively(input, key, from, mid - 1);
        } else if (input[mid] < key) {
            return searchRecursively(input, key, mid + 1, to);
        } else {
            return mid;
        }
    }

    public static int searchIteratively(int[] input, int key) {
        int from = 0;
        int to = input.length - 1;

        while (from <= to) {
            int mid = from + ((to - from) >> 1);
            if (input[mid] > key) {
                to = mid - 1;
            } else if (input[mid] < key) {
                from = mid + 1;
            } else {
                return mid;
            }
        }

        return -1;
    }

}
