package idv.carl.leetcode.algorithms.easy.twosum.unsorted;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Carl Lu
 */
public class Solution {

    /*
     * Time complexity: O(n^2)
     * Space complexity: O(1)
     * */
    public static int[] brutalTwoSum(int[] input, int target) {
        for (int i = 0; i < input.length; i++) {
            for (int j = i + 1; j < input.length; j++) {
                if (input[i] + input[j] == target) {
                    return new int[] {i, j};
                }
            }
        }
        throw new IllegalArgumentException("No solution.");
    }

    /*
     * Time complexity: O(n)
     * Space complexity: O(n)
     * */
    public static int[] optimizedTwoSum(int[] input, int target) {
        Map<Integer, Integer> inputMapping = new HashMap<>();
        for (int i = 0; i < input.length; i++) {
            if (inputMapping.containsKey(target - input[i])) {
                return new int[] {inputMapping.get(target - input[i]), i};
            } else {
                inputMapping.put(input[i], i);
            }
        }
        throw new IllegalArgumentException("No solution.");
    }

}
