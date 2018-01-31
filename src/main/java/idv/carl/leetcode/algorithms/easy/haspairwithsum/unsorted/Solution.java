package idv.carl.leetcode.algorithms.easy.haspairwithsum.unsorted;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Carl Lu
 */
public class Solution {

    public static boolean hasPairWithSumInUnorderedArray(int[] array, int sum) {
        Map<Integer, Integer> complements = new HashMap<>();
        for (Integer element : array) {
            if (complements.containsKey(element)) {
                return true;
            }
            complements.put(sum - element, 0);
        }
        return false;
    }

}
