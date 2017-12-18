package idv.carl.leetcode.algorithms.easy.reverseinteger;

/**
 * @author Carl Lu
 */
public class Solution {

    private final static int MAX_32_BIT_INTEGER = ( (int) Math.pow(2, 31) ) - 1;
    private final static int MIN_32_BIT_INTEGER = -(int) Math.pow(2, 31);

    public static int reverseInteger(int input) {
        boolean isNegative = false;
        if (input < 0) {
            isNegative = true;
            input *= -1;
        }

        String inputString = Integer.toString(input);
        String reversedString = new StringBuilder(inputString).reverse().toString();

        int result;
        try {
            result = Integer.parseInt(reversedString);
        } catch (NumberFormatException overflow) {
            return 0;
        }

        if (isNegative) {
            result *= -1;
        }

        return result;
    }

    public static int optimizedReverseInteger(int input) {
        int result = 0;

        while (input != 0) {

            if (result > MAX_32_BIT_INTEGER / 10 || result < MIN_32_BIT_INTEGER / 10 || ( result == MAX_32_BIT_INTEGER / 10 && (
                    input % 10 > 7 ) ) || result == MIN_32_BIT_INTEGER / 10 && ( input % 10 < -8 )) {
                return 0;
            }

            result = ( result * 10 ) + ( input % 10 );
            input /= 10;
        }

        return result;
    }

}
