package idv.carl.leetcode.algorithms.easy.poweroftwo;

/**
 * @author Carl Lu
 */
public class Solution {

    public static boolean isPowerOfTwo(int n) {
        return n < 1 ? false : (n & (n-1)) == 0 ? true : false;
    }

    public static void main(String args[]) {
        System.out.println(isPowerOfTwo(32));
        System.out.println(isPowerOfTwo(15));
    }

}
