package idv.carl.leetcode.algorithms.easy.fibonacci;

import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Carl Lu
 */
public class FibonacciDynamicProgrammingWithBigInput {

    private static Map<Integer, BigInteger> cachedFibResults = new HashMap<>();

    /*
     * Dynamic Programming — Memoization
     * (Bottom-Up Approach)
     *
     * Store the sub-problems result so that you don't have to calculate again.
     * So first check if solution is already available,
     * if yes then use it else calculate and store it for future.
     *
     * Time Complexity: O(n)
     * Space Complexity: O(n)
     *
     * Please add the following jvm option when running this method or it will cause java.lang.StackOverflowError:
     * -Xss2m
     */
    public static BigInteger findFibonacciWithBigInput(int n) {
        if (n == 0) {
            return BigInteger.ZERO;
        } else if (n == 1) {
            return BigInteger.ONE;
        }

        if (cachedFibResults.containsKey(n)) {
            return cachedFibResults.get(n);
        }

        BigInteger currentFibNumber = findFibonacciWithBigInput(n - 1).add(findFibonacciWithBigInput(n - 2));
        cachedFibResults.put(n, currentFibNumber);
        return currentFibNumber;
    }

}
