package idv.carl.leetcode.algorithms.medium.oneeditdistance;

/**
 * @author Carl Lu
 */
public class Solution {

    public static boolean isOneEditDistance(String inputA, String inputB) {
        int shortLength = inputA.length();
        int longLength = inputB.length();

        if (shortLength > longLength) {
            return isOneEditDistance(inputB, inputA);
        }

        int lengthDiff = longLength - shortLength;

        if (lengthDiff > 1) {
            return false;
        }

        int index = 0;
        while (index < shortLength && inputA.charAt(index) == inputB.charAt(index)) {
            index++;
        }
        if (index == shortLength) {
            return lengthDiff > 0;
        }

        if (lengthDiff == 0) {
            index++;
        }
        while (index < shortLength && inputA.charAt(index) == inputB.charAt(index + lengthDiff)) {
            index++;
        }

        return index == shortLength;
    }

}
