package idv.carl.leetcode.algorithms.easy.fizzBuzz;

/**
 * @author Carl Lu
 */
public class FizzBuzz {

    public static void main(String args[]) {
        // The Concatenation Way
        for (int i = 1; i <= 100; i++) {
            String result = i + ": ";
            if (i % 3 == 0) {
                result += "Fizz";
            }
            if (i % 5 == 0) {
                result += "Buzz";
            }
            System.out.println(result);
        }
    }

}
