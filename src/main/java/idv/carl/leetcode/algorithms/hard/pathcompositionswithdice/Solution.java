package idv.carl.leetcode.algorithms.hard.pathcompositionswithdice;

import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Carl Lu
 */
public class Solution {

    private static Map<Integer, BigInteger> cachedPathCompositionResults = new HashMap<>();

    /*
     * This problem can be seen as an expansion of the ordinary Fibonacci sequence:
     * https://rosettacode.org/wiki/Fibonacci_n-step_number_sequences
     *
     * For rolling one dice, we can see it as the hexanacci sequence with initial values: [1, 1, 2, 4, 8, 16]
     */
    public static BigInteger calculatePathComposition(int distance) {
        if (distance == 0) {
            return BigInteger.ONE;
        } else if (distance == 1) {
            return BigInteger.ONE;
        } else if (distance == 2) {
            return new BigInteger("2");
        } else if (distance == 3) {
            return new BigInteger("4");
        } else if (distance == 4) {
            return new BigInteger("8");
        } else if (distance == 5) {
            return new BigInteger("16");
        }

        if (cachedPathCompositionResults.containsKey(distance)) {
            return cachedPathCompositionResults.get(distance);
        }

        BigInteger currentCompositionCount = calculatePathComposition(distance - 1).add(calculatePathComposition(distance - 2))
                .add(calculatePathComposition(distance - 3))
                .add(calculatePathComposition(distance - 4))
                .add(calculatePathComposition(distance - 5))
                .add(calculatePathComposition(distance - 6));

        cachedPathCompositionResults.put(distance, currentCompositionCount);

        return currentCompositionCount;
    }

}
