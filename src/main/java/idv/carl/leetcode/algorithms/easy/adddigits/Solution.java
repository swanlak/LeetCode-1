package idv.carl.leetcode.algorithms.easy.adddigits;

/**
 * @author Carl Lu
 */
public class Solution {

    /*
    * Recursive solution
    * */
    public static void main(String[] args) {
        int number = 1367;
        System.out.println("Result: " + addDigits(number));
    }

    private static int addDigits(int input) {
        return input < 10 ? input : input % 10 + addDigits(input / 10);
    }

}
