package idv.carl.leetcode.algorithms.easy.findarithmeticslices;

/**
 * @author Carl Lu
 */
class Solution {
    public static int solution(int[] A) {
        int size = A.length;

        if(size < 3 || A == null) {
            return 0;
        }

        int idxStart = 0;
        int countForSlices = 0;

        while(idxStart < size - 2) {
            int idxEnd = idxStart + 1;
            int arithmeticDiff = A[idxEnd] - A[idxStart];
            while ((idxEnd < size -1) && (A[idxEnd + 1] - A[idxEnd] == arithmeticDiff)) {
                idxEnd++;
            }
            int sliceSize = idxEnd - idxStart + 1;
            if(sliceSize >= 3) {
                countForSlices += ((sliceSize - 2) * (sliceSize - 1) / 2);
            }
            idxStart = idxEnd;
        }

        return (countForSlices > Integer.MAX_VALUE) ? -1 :countForSlices;
    }

    public static void main(String args[]) {
        int[] input = new int[]{-1, 1, 3, 3, 3, 2, 1, 0};
        System.out.println(solution(input));
    }
}