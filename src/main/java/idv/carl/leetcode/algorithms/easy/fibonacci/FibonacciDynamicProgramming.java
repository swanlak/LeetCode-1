package idv.carl.leetcode.algorithms.easy.fibonacci;

/**
 * @author Carl Lu
 */
public class FibonacciDynamicProgramming {

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
    public static long findFibonacciWithDynamicProgramming(int n) {
        long fib[] = new long[n + 1];
        fib[0] = 1l;
        fib[1] = 1l;

        for (int i = 0; i <= n; i++) {
            if (i <= 1) {
                System.out.println("Fibonacci " + i + ": " + fib[i]);
            } else {
                fib[i] = fib[i - 1] + fib[i - 2];
                System.out.println("Fibonacci " + i + ": " + fib[i]);
            }
        }

        return fib[n];
    }

    public static void main(String args[]) {
        findFibonacciWithDynamicProgramming(10);
    }

}
