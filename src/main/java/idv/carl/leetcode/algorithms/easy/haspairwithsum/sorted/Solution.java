package idv.carl.leetcode.algorithms.easy.haspairwithsum.sorted;

/**
 * @author Carl Lu
 */
public class Solution {

    public static boolean hasPairWithSumInUnorderedArray(int[] array, int sum) {
        int from = 0;
        int to = array.length - 1;

        while (from < to) {
            int actual = array[from] + array[to];
            if (actual == sum) {
                return true;
            } else if (actual > sum) {
                to--;
            } else if (actual < sum) {
                from++;
            }
        }
        return false;
    }

}
