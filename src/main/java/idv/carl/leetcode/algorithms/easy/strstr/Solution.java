package idv.carl.leetcode.algorithms.easy.strstr;

/**
 * @author Carl Lu
 */
public class Solution {

    /*
     * Time complexity: O(mn)
     * Space complexity: O(1)
     * */
    public static int strStr(String haystack, String needle) {
        /*
         * Here the iterative condition is "<=" because we want to handle the case which length = 0
         * */
        for (int i = 0; i <= haystack.length(); i++) {
            for (int j = 0; j <= needle.length(); j++) {
                /*
                 * i: current index of haystack
                 * j: current index of needle, it also represents the Nth char after index i
                 * */
                if (j == needle.length()) {
                    return i;
                }
                if (i + j == haystack.length()) {
                    return -1;
                }
                if (needle.charAt(j) != haystack.charAt(i + j)) {
                    break;
                }
            }
        }
        throw new IllegalArgumentException("No solution.");
    }

}
