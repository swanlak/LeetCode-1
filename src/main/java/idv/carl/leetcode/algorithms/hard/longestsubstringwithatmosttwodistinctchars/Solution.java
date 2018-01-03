package idv.carl.leetcode.algorithms.hard.longestsubstringwithatmosttwodistinctchars;

/**
 * @author Carl Lu
 */
public class Solution {

    /*
     * Time Complexity: O(n)
     * Space Complexity: O(1)
     */
    public static int findLengthOfLongestSubstringWithDistinctOccurrenceLimit(String input, int distinctOccurrenceLimit) {
        if (input == null || input.isEmpty() || distinctOccurrenceLimit <= 0) {
            return 0;
        }

        int[] characterOccurrenceMapping = new int[256];
        int leftBoundOfSlidingWindow = 0;
        int maxLength = 0;
        int distinctCount = 0;

        for (int rightBoundOfSlidingWindow = 0; rightBoundOfSlidingWindow < input.length(); rightBoundOfSlidingWindow++) {
            if (characterOccurrenceMapping[input.charAt(rightBoundOfSlidingWindow)] == 0) {
                distinctCount++;
            }

            characterOccurrenceMapping[input.charAt(rightBoundOfSlidingWindow)]++;

            while (distinctCount > distinctOccurrenceLimit) {
                characterOccurrenceMapping[input.charAt(leftBoundOfSlidingWindow)]--;
                if (characterOccurrenceMapping[input.charAt(leftBoundOfSlidingWindow)] == 0) {
                    distinctCount--;
                }
                leftBoundOfSlidingWindow++;
            }

            maxLength = Math.max(maxLength, ( rightBoundOfSlidingWindow - leftBoundOfSlidingWindow + 1 ));
        }

        return maxLength;
    }

}
