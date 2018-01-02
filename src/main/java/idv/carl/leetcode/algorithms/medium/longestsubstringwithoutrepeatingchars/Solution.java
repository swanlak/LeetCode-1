package idv.carl.leetcode.algorithms.medium.longestsubstringwithoutrepeatingchars;

import java.util.Arrays;

/**
 * @author Carl Lu
 */
public class Solution {

    private final static int NOT_YET_APPEAR = -1;

    /*
     * Time Complexity: O(n)
     * Space Complexity: O(1)
     */
    public static int lengthOfLongestSubstring(String input) {
        int[] characterMapping = new int[256];
        Arrays.fill(characterMapping, NOT_YET_APPEAR);

        int start = 0;
        int maxLength = 0;

        for (int i = 0; i < input.length(); i++) {
            if (characterMapping[input.charAt(i)] >= start) {
                start = characterMapping[input.charAt(i)] + 1;
            }
            characterMapping[input.charAt(i)] = i;
            maxLength = Math.max(maxLength, ( i - start + 1 ));
        }

        return maxLength;
    }

}
