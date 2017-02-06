package idv.carl.leetcode.algorithms.medium.permutations;

import java.util.LinkedList;
import java.util.List;

/**
 * @author Carl Lu
 */
public class Solution {

    public static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new LinkedList<List<Integer>>();
        calculatePermutations(result, nums, 0);
        return result;
    }

    private static void calculatePermutations(List<List<Integer>> result, int[] nums, int start) {
        if(start == nums.length - 1) {
            List<Integer> list = new LinkedList<Integer>();
            for (int i : nums) {
                list.add(i);
            }
            result.add(list);
        } else {
            for(int i = start; i < nums.length; i++) {
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
        int[] input = new int[] {1, 2, 3, 4, 5};
        for (List<Integer> list : permute(input)) {
            for (Integer i : list) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }

}
