package idv.carl.leetcode.algorithms.easy.fibonacci;

/**
 * @author Carl Lu
 */
class FibonacciDynamicProgramming {

    /*
     * Dynamic Programming — Memoization
     * (Bottom-Up Approach)
     * 
     * Store the sub-problems result so that you don’t have to calculate again.
     * So first check if solution is already available,
     * if yes then use it else calculate and store it for future.
     *
     * Time Complexity: O(n) , Space Complexity : O(n)
     */
    static long findFibonacci(int n) {
        long[] fib = new long[n + 1];

        fib[0] = 0L;
        fib[1] = 1L;

        for (int i = 0; i <= n; i++) {
            if (i > 1) {
                fib[i] = fib[i - 1] + fib[i - 2];
            }
        }

        return fib[n];
    }

}
