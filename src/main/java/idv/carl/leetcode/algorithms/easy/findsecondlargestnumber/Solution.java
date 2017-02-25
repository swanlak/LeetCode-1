package idv.carl.leetcode.algorithms.easy.findsecondlargestnumber;

/**
 * @author Carl Lu
 */
public class Solution {

    public static int findSecondLargestNumber(int[] input) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int number : input) {
            if (number >= largest) {
                largest = number;
            } else if (number > secondLargest) {
                secondLargest = number;
            }
        }

        return secondLargest;
    }

}
