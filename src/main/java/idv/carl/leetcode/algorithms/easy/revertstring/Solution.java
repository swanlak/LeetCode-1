package idv.carl.leetcode.algorithms.easy.revertstring;

/**
 * @author Carl Lu
 */
public class Solution {

    public static String revertStringIteratively(String input) {
        if (null == input || input.length() <= 1) {
            return input;
        }

        char[] inputArray = input.toCharArray();
        int from = 0;
        int to = inputArray.length - 1;
        char tmp;

        while (to > from) {
            tmp = inputArray[to];
            inputArray[to] = inputArray[from];
            inputArray[from] = tmp;
            to--;
            from++;
        }

        return new String(inputArray);
    }

    public static String revertStringRecursively(String input) {
        if (null == input || input.length() <= 1) {
            return input;
        }

        return revertStringRecursively(input.substring(1)) + input.charAt(0);
    }

    public static char[] revertStringRecursivelyInHalfTime(char[] input, int from, int to) {
        if (null == input || input.length <= 1) {
            return input;
        }

        if (from < to) {
            swap(input, from, to);
            revertStringRecursivelyInHalfTime(input, ++from, --to);
        }

        return input;
    }

    private static void swap(char[] input, int from, int to) {
        char tmp = input[from];
        input[from] = input[to];
        input[to] = tmp;
    }
}
