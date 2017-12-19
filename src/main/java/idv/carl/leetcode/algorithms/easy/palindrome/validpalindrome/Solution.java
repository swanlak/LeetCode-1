package idv.carl.leetcode.algorithms.easy.palindrome.validpalindrome;

/**
 * @author Carl Lu
 */
public class Solution {

    /*
     * Time complexity: O(n)
     * Space complexity: O(1)
     * */
    public static boolean isValidPalindrome(String input) {
        int from = 0;
        int to = input.length() - 1;

        while (to > from) {
            while (to > from && !Character.isLetterOrDigit(input.charAt(from))) {
                from++;
            }

            while (to > from && !Character.isLetterOrDigit(input.charAt(to))) {
                to--;
            }

            if (Character.toLowerCase(input.charAt(from)) != Character.toLowerCase(input.charAt(to))) {
                return false;
            }

            from++;
            to--;
        }

        return true;
    }

}
