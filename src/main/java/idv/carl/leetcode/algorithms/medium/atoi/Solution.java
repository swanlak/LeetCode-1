package idv.carl.leetcode.algorithms.medium.atoi;

/**
 * @author Carl Lu
 */
public class Solution {

    private final static char POSITIVE_SIGN = '+';
    private final static char NEGATIVE_SIGN = '-';

    /*
     * Time Complexity: O(n)
     * Space Complexity: O(1)
     */
    public static int aToI(String input) {
        int index = 0;
        int inputLength = input.length();
        int sign = 1;

        while (index < inputLength && Character.isWhitespace(input.charAt(index))) {
            index++;
        }

        if (index < inputLength && input.charAt(index) == NEGATIVE_SIGN) {
            sign = -1;
            index++;
        } else if (index < inputLength && input.charAt(index) == POSITIVE_SIGN) {
            index++;
        }

        int result = 0;
        while (index < inputLength && Character.isDigit(input.charAt(index))) {
            int currentDigit = Character.getNumericValue(input.charAt(index));
            if (( result > Integer.MAX_VALUE / 10 ) || ( result == Integer.MAX_VALUE / 10 && currentDigit >= 8 )) {
                return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }
            result = ( result * 10 ) + currentDigit;
            index++;
        }

        return sign * result;
    }

}
