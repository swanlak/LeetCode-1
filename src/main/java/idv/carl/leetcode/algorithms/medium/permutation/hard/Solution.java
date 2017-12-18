package idv.carl.leetcode.algorithms.medium.permutation.hard;

/**
 * @author Carl Lu
 */
public class Solution {

    public static String[] permutationOfCollection(String[] input, int permutationLength) {
        /*
         * From the description in question, we can know that the result will have n^k cases,
         * here n means the number of elements of the input data and k means the length of the permutation.
         * */
        String[] result = new String[(int) Math.pow(input.length, permutationLength)];

        if (permutationLength == 0) {
            return new String[] {};
        } else if (permutationLength == 1) {
            return input;
        } else {
            String[] subResults = permutationOfCollection(input, permutationLength - 1);

            int resultIndex = 0;

            for (String element : input) {
                for (String subResult : subResults) {
                    result[resultIndex] = element + subResult;
                    resultIndex++;
                }
            }
        }

        return result;
    }

}
