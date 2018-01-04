package idv.carl.leetcode.algorithms.medium.reversewordsinastring;

import java.util.Arrays;
import java.util.LinkedList;

/**
 * @author Carl Lu
 */
public class Solution {

    /*
     * Time Complexity: O(n)
     * Space Complexity: O(n)
     * */
    public static String reverseWordsByStringApi(String input) {
        String[] splitedInput = input.split("\\s+");
        String result = "";

        for (int i = splitedInput.length - 1; i >= 0; i--) {
            result += splitedInput[i] + " ";
        }

        return result.trim();
    }

    /*
     * Time Complexity: O(n)
     * Space Complexity: O(n)
     * */
    public static String reverseWordsByLambdaApi(String input) {
        StringBuilder result = new StringBuilder();
        new LinkedList<>(Arrays.asList(input.split("\\s+"))).descendingIterator()
                .forEachRemaining(word -> result.append(word).append(" "));
        return result.toString().trim();
    }

    /*
     * Time Complexity: O(n)
     * Space Complexity: O(n)
     * */
    public static String reverseWordsByPointers(String input) {
        StringBuilder result = new StringBuilder();
        int rightBound = input.length();

        for (int leftBound = input.length() - 1; leftBound >= 0; leftBound--) {
            if (input.charAt(leftBound) == ' ') {
                rightBound = leftBound;
            } else if (leftBound == 0 || input.charAt(leftBound - 1) == ' ') {
                result.append(input.substring(leftBound, rightBound)).append(" ");
            }
        }

        return result.toString().trim();
    }
}
