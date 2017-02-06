package idv.carl.leetcode.algorithms.easy.adddigits;

/**
 * @author Carl Lu
 */
public class Solution {

    public static int addDigits(int num) {
        return (num - 1) % 9 + 1;
    }

    public static void main(String args[]) {
        int number = 438758937;
        System.out.println("The digital root of " + number + " is: " + addDigits(number));
    }

}
