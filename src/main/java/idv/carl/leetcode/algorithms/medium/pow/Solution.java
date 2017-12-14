package idv.carl.leetcode.algorithms.medium.pow;

/**
 * @author Carl Lu
 */
public class Solution {

    /*
     * With optimization, it can speed up for more than 1000 times faster.
     * */
    public static double optimizedPow(double base, int power) {
        if (power == 0) {
            return 1;
        }

        if (power == Integer.MIN_VALUE) {
            base = base * base;
            power = power / 2;
        }

        if (power < 0) {
            power *= -1;
            base = 1 / base;
        }

        if (power % 2 == 0) {
            // pow(2, 6) = 2^6 = 2 * 2 * 2 * 2 * 2 * 2 = 4 * 4 * 4 = pow(4, 3)
            return optimizedPow(base * base, power / 2);
        } else {
            // pow(2, 5) = 2^5 = 2 * 2 * 2 * 2 * 2 = 4 * 4 * 2 = 2 * pow(4, 2)
            return base * optimizedPow(base * base, power / 2);
        }
    }

    public static double pow(double base, int power) {
        double result = 1;
        boolean isNegative = false;

        if (power == Integer.MIN_VALUE) {
            base = base * base;
            power = power / 2;
        }

        if (power < 0) {
            isNegative = true;
            power *= -1;
        }

        for (int i = 0; i < power; i++) {
            result *= base;
        }

        if (isNegative) {
            result = 1 / result;
        }

        return result;
    }

}
