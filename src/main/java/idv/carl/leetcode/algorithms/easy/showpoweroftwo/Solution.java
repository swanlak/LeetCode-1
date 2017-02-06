package idv.carl.leetcode.algorithms.easy.showpoweroftwo;

/**
 * @author Carl Lu
 */
public class Solution {

    public static void showPowerOfTwo(int[] input) {
        StringBuilder result = new StringBuilder();
        for(int i = 0; i < input.length; i++) {
            int shiftCount = 0;
            int num = input[i];

            if(!(num < 1)) {
                if((num & (num - 1)) == 0) {
                    while ( num != 1) {
                        num = num >> 1;
                        shiftCount++;
                    }
                    result.append(input[i] + " is 2^" + shiftCount + ", ");
                }
            }
        }
        System.out.print(result.toString().substring(0, result.toString().length() - 2));
    }

    public static void main(String args[]) {
        int[] input = new int[] {1, 7, 9, 4, 8, 13, 32};
        showPowerOfTwo(input);
    }

}
