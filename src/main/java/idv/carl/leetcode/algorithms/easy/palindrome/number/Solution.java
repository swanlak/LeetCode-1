package idv.carl.leetcode.algorithms.easy.palindrome.number;

/**
 * @author Carl Lu
 */
public class Solution {

    public static boolean isPalindrome(int input) {
        if (input < 0) {
            return false;
        } else {
            int divisor = 1;
            // 12321 / 10000 = 1 -> shift to the left hand side.
            while (input / divisor >= 10) {
                divisor *= 10;
            }
            while (input != 0) {
                int leftDigit = input / divisor;
                int rightDigit = input % 10;
                if (leftDigit != rightDigit) {
                    return false;
                }
                /*
                 * input = 12321, divisor = 10000
                 * I hope input can change like this: 12321 -> 2321 -> 232
                 * */
                input = ( input % divisor ) / 10;
                divisor /= 100;
            }
            return true;
        }
    }

}
