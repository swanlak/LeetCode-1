package idv.carl.leetcode.algorithms.easy.twosum.sorted;

/**
 * @author Carl Lu
 */
public class Solution {

    /*
     * Time complexity: O(nlogn)
     * Space complexity: O(1)
     * */
    public static int[] sortedTwoSumByBinaryTree(int[] input, int target) {
        for (int i = 0; i < input.length; i++) {
            int current = input[i];
            int another = binarySearch(input, target - current);
            if (another != -1) {
                return new int[] {i, another};
            }
        }
        throw new IllegalArgumentException("No solution.");
    }

    /*
     * Time complexity: O(n)
     * Space complexity: O(1)
     * */
    public static int[] sortedTwoSumByPointer(int[] input, int target) {
        int from = 0;
        int to = input.length - 1;
        while (from < to) {
            int sum = input[from] + input[to];
            if (sum < target) {
                from++;
            } else if (sum > target) {
                to--;
            } else {
                return new int[] {from, to};
            }
        }
        throw new IllegalArgumentException("No solution.");
    }

    private static int binarySearch(int[] input, int key) {
        int low = 0;
        int high = input.length - 1;
        while (high >= low) {
            int middle = low + ( ( high - low ) >> 1 );
            if (input[middle] == key) {
                return middle;
            }
            if (input[middle] < key) {
                low = middle + 1;
            }
            if (input[middle] > key) {
                high = middle - 1;
            }
        }
        return -1;
    }
}
