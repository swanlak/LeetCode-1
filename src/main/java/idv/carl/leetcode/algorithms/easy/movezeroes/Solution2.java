package idv.carl.leetcode.algorithms.easy.movezeroes;

/**
 * @author Carl Lu
 */
public class Solution2 {

    public static void moveZeroes(int[] nums) {

        int movings = 0;

        for(int i = 0; i < nums.length; i++) {
            if(nums[i] == 0) {
                movings++;
                continue;
            }

            int temp = nums[i - movings];
            nums[i - movings] = nums[i];
            nums[i] = temp;
        }

    }

    public static void main(String args[]) {
        int[] input = new int[]{0, 1, 0, 3, 12};
        moveZeroes(input);
    }

}
