package idv.carl.leetcode.algorithms.easy.fibonacci;

/**
 * @author Carl Lu
 */
public class Fibonacci {

    /*
     * Recursive solution.
     *
     * This solution cannot solve big input.
     * You can found that it will go very slowly after n ≥ 35
     *
     * Time Complexity: O(2^n)
     */
    public static long fibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

    public static void main(String args[]) {
        int n = 50;
        for (int i = 1; i <= n; i++) {
            System.out.println(i + ": " + fibonacci(i));
        }
    }

}
