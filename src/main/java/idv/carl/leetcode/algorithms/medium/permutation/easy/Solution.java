package idv.carl.leetcode.algorithms.medium.permutation.easy;

import java.util.LinkedList;
import java.util.List;

/**
 * @author Carl Lu
 */
public class Solution {

    public static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new LinkedList<>();
        calculatePermutations(result, nums, 0);
        return result;
    }

    private static void calculatePermutations(List<List<Integer>> result, int[] nums, int start) {
        /*
         * start == nums.length - 1
         * It means that you don't need to find out permutations.
         */
        if (start == nums.length - 1) {
            List<Integer> list = new LinkedList<>();
            for (int i : nums) {
                list.add(i);
            }
            result.add(list);
        } else {
            for (int i = start; i < nums.length; i++) {
                swap(nums, i, start);
                calculatePermutations(result, nums, start + 1);
                swap(nums, i, start);
            }
        }
    }

    private static void swap(int[] input, int i, int j) {
        int tmp = input[i];
        input[i] = input[j];
        input[j] = tmp;
    }

    public static void main(String args[]) {
        int[] input = new int[] {1, 2, 3};
        for (List<Integer> list : permute(input)) {
            for (Integer i : list) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }

}
