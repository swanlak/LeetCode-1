package idv.carl.leetcode.algorithms.easy.plusone;

/**
 * @author Carl Lu
 */
public class Solution {

    public static int[] plusOne(int[] input) {
        for (int i = input.length - 1; i >= 0; i--) {
            int currentDigit = input[i];
            if (currentDigit < 9) {
                input[i] = currentDigit + 1;
                return input;
            } else {
                input[i] = 0;
            }
        }

        int[] extendedResult = new int[input.length + 1];
        extendedResult[0] = 1;
        return extendedResult;
    }

}
