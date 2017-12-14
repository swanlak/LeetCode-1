package idv.carl.leetcode.algorithms.easy.plusone;

/**
 * @author Carl Lu
 */
public class Solution {

    public static int[] plusOne(int[] number) {
        boolean isNegative = number[0] < 0;

        for (int i = number.length - 1; i >= 0; i--) {
            int currentDigit = number[i];

            if (isNegative) {
                if (currentDigit > 0) {
                    number[i] = currentDigit - 1;
                    return number;
                }
            } else {
                if (currentDigit < 9) {
                    number[i] = currentDigit + 1;
                    return number;
                } else {
                    number[i] = 0;
                }
            }
        }

        int[] result;

        if (isNegative) {
            if (number[0] == -1) {
                result = new int[number.length - 1];
                result[0] = -9;
            } else {
                result = number;
                result[0] = number[0] + 1;
            }
            for (int i = 1; i < result.length; i++) {
                result[i] = 9;
            }
        } else {
            result = new int[number.length + 1];
            result[0] = 1;
        }

        return result;
    }

}
