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
}
