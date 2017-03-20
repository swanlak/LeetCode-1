package idv.carl.leetcode.algorithms.easy.fibonacci;

/**
 * @author Carl Lu
 */
public class FibonacciRecursive {

    /*
     * Recursive solution.
     *
     * This solution cannot solve big input.
     * You can found that it will go very slowly after n ≥ 35
     *
     * Time Complexity: O(2^n)
     */
    public static long findFibonacci(int n) {
        long result = 0;

        for (int i = 1; i <= n; i++) {
            if (n <= 1) {
                result = n;
            } else {
                result = findFibonacci(n - 1) + findFibonacci(n - 2);
            }
        }

        return result;
    }

}
