package idv.carl.leetcode.algorithms.easy.insertsymbolbetweenevenandodd;

/**
 * @author Carl Lu
 */
public class SymbolBetweenEvenAndOdd {

    private final static String CHAR_STAR = "*";
    private final static String CHAR_DASH = "-";
    private final static String EMPTY = "";

    public static String getResult(String input) {
        String result = EMPTY;
        char[] numbers = input.toCharArray();

        for (int i = 1; i < numbers.length; i++) {
            Integer former = Character.getNumericValue(numbers[i - 1]);
            Integer latter = Character.getNumericValue(numbers[i]);

            if (result.length() == 0) {
                result = appendResult(result, former, null, null);
            } else if (containsZero(former, latter)) {
                if (i == numbers.length - 1) {
                    result = appendResult(result, former, latter, EMPTY);
                } else {
                    result = appendResult(result, former, null, null);
                }
            } else if (bothEven(former, latter)) {
                result = appendResult(result, former, null, CHAR_STAR);
            } else if (bothOdd(former, latter)) {
                result = appendResult(result, former, null, CHAR_DASH);
            } else if (i == numbers.length - 1) {
                if (bothEven(former, latter)) {
                    result = appendResult(result, former, latter, CHAR_STAR);
                } else if (bothOdd(former, latter)) {
                    result = appendResult(result, former, latter, CHAR_DASH);
                } else {
                    result = appendResult(result, former, latter, EMPTY);
                }
            } else {
                result = appendResult(result, former, null, null);
            }
        }
        return result.toString();
    }

    private static String appendResult(String result, Integer former, Integer latter, String symbol) {
        if (former != null && latter != null && symbol != null) {
            result += former + symbol + latter;
        } else if (former != null && symbol != null) {
            result += former + symbol;
        } else if (former != null) {
            result += former;
        }
        return result;
    }

    private static boolean containsZero(int former, int latter) {
        return isZero(former) || isZero(latter);
    }

    private static boolean bothEven(int former, int latter) {
        return !isOdd(former) && !isOdd(latter);
    }

    private static boolean bothOdd(int former, int latter) {
        return isOdd(former) && isOdd(latter);
    }

    private static boolean isOdd(int input) {
        return input % 2 != 0;
    }

    private static boolean isZero(int input) {
        return input == 0;
    }

}
