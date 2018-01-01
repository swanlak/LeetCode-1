package idv.carl.leetcode.algorithms.hard.validnumber;

/**
 * @author Carl Lu
 */
public class RefactorSolution {

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

        index = incrementIndexIfIsWhiteSpace(index, input);
        index = incrementIndexIfIsPositiveOrNegativeSign(index, input);

        boolean isNumeric = false;

        while (isDigit(index, input)) {
            index++;
            isNumeric = true;
        }

        if (( index < inputLength ) && ( input.charAt(index) == POINT )) {
            index++;
            while (isDigit(index, input)) {
                index++;
                isNumeric = true;
            }
        }

        if (isNumeric && ( index < inputLength ) && ( input.charAt(index) == SCIENTIFIC_NOTATION )) {
            index++;
            isNumeric = false;
            index = incrementIndexIfIsPositiveOrNegativeSign(index, input);
            while (isDigit(index, input)) {
                index++;
                isNumeric = true;
            }
        }

        index = incrementIndexIfIsWhiteSpace(index, input);

        return isNumeric && ( index == inputLength );
    }

    private static int incrementIndexIfIsWhiteSpace(int index, String input) {
        while (( index < input.length() ) && ( Character.isWhitespace(input.charAt(index)) )) {
            index++;
        }
        return index;
    }

    private static int incrementIndexIfIsPositiveOrNegativeSign(int index, String input) {
        if (( index < input.length() ) && ( input.charAt(index) == POSITIVE_SIGN || input.charAt(index) == NEGATIVE_SIGN )) {
            index++;
        }
        return index;
    }

    private static boolean isDigit(int index, String input) {
        return ( index < input.length() ) && ( Character.isDigit(input.charAt(index)) );
    }

}
