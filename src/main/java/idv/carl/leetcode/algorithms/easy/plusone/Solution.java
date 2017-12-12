package idv.carl.leetcode.algorithms.easy.plusone;

/**
 * @author Carl Lu
 */
public class Solution {

    public static int[] plusOne(int[] number) {
        for (int i = number.length - 1; i >= 0; i--) {
            int currentDigit = number[i];
            if (currentDigit < 9) {
                number[i] = currentDigit + 1;
                return number;
            } else {
                number[i] = 0;
            }
        }

        int[] increasedNumber = new int[number.length + 1];
        increasedNumber[0] = 1;
        return increasedNumber;
    }

}
