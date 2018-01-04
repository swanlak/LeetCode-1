package idv.carl.leetcode.algorithms.medium.reversewordsinastringinplace;

/**
 * @author Carl Lu
 */
public class Solution {

    /*
     * Time Complexity: O(n)
     * Space Complexity: O(1)
     */
    public static void reverseWordsInPlace(char[] input) {
        reverseInput(input, 0, input.length - 1);
        int from = 0;
        for (int to = 0; to <= input.length; to++) {
            if (to == input.length || input[to] == ' ') {
                reverseInput(input, from, to - 1);
                from = to + 1;
            }
        }
    }

    private static void reverseInput(char[] input, int from, int to) {
        for (int i = 0; i <= ( to - from ) / 2; i++) {
            char temp = input[from + i];
            input[from + i] = input[to - i];
            input[to - i] = temp;
        }
    }

}
