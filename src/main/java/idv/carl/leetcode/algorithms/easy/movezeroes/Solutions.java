package idv.carl.leetcode.algorithms.easy.movezeroes;

/**
 * @author Carl Lu
 */
public class Solutions {

    public static void moveZeroes(int[] nums) {

        int n = nums.length;

        for (int i = 0; i < n; i++) {
            for(int j = i + 1; j < n ; j++) {
                if(nums[i] == 0) {
                    int temp = nums[j];
                    nums[j] = nums[i];
                    nums[i] = temp;
                }
            }
        }

    }

    public static void main(String args[]) {
        int[] input = new int[]{0, 1, 0, 3, 12};
        moveZeroes(input);
    }

}
