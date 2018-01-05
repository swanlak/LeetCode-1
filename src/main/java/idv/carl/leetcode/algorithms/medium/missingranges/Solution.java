package idv.carl.leetcode.algorithms.medium.missingranges;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Carl Lu
 */
public class Solution {

    /*
     * Time Complexity: O(n)
     * Space Complexity: O(1)
     */
    public static List<String> findMissingRanges(int[] input, int start, int end) {
        List<String> result = new ArrayList<>();
        int previousNumber = start - 1;
        for (int i = 0; i <= input.length; i++) {
            int currentNumber = ( i == input.length ) ? ( end + 1 ) : input[i];
            if (currentNumber - previousNumber >= 2) {
                int from = previousNumber + 1;
                int to = currentNumber - 1;
                if (from == to) {
                    result.add(String.valueOf(from));
                } else {
                    result.add(String.valueOf(from + "->" + to));
                }
            }
            previousNumber = currentNumber;
        }
        return result;
    }

}
