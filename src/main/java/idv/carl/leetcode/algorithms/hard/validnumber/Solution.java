package idv.carl.leetcode.algorithms.hard.validnumber;

/**
 * @author Carl Lu
 */
public class Solution {

    private final static char POSITIVE_SIGN = '+';
    private final static char NEGATIVE_SIGN = '-';
    private final static char POINT = '.';
    private final static char SCIENTIFIC_NOTATION = 'e';

    /*
     * Time Complexity: O(n)
     * Space Complexity: O(1)
     */
    public static boolean isValidNumber(String input) {
        int index = 0;
        int inputLength = input.length();

        while (( index < inputLength ) && ( Character.isWhitespace(input.charAt(index)) )) {
            index++;
        }

        if (( index < inputLength ) && ( input.charAt(index) == POSITIVE_SIGN || input.charAt(index) == NEGATIVE_SIGN )) {
            index++;
        }

        boolean isNumeric = false;

        while (( index < inputLength ) && ( Character.isDigit(input.charAt(index)) )) {
            index++;
            isNumeric = true;
        }

        if (( index < inputLength ) && ( input.charAt(index) == POINT )) {
            index++;
            while (( index < inputLength ) && ( Character.isDigit(input.charAt(index)) )) {
                index++;
                isNumeric = true;
            }
        }

        if (isNumeric && ( index < inputLength ) && ( input.charAt(index) == SCIENTIFIC_NOTATION )) {
            index++;
            isNumeric = false;
            if (( index < inputLength ) && ( input.charAt(index) == POSITIVE_SIGN || input.charAt(index) == NEGATIVE_SIGN )) {
                index++;
            }
            while (( index < inputLength ) && ( Character.isDigit(input.charAt(index)) )) {
                index++;
                isNumeric = true;
            }
        }

        while (( index < inputLength ) && ( Character.isWhitespace(input.charAt(index)) )) {
            index++;
        }

        return isNumeric && ( index == inputLength );
    }

}
