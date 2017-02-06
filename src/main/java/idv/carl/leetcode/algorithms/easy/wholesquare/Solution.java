package idv.carl.leetcode.algorithms.easy.wholesquare;

/**
 * @author Carl Lu
 */
public class Solution {

    public static int solution(int A, int B) {

        if(A > B) {
            return 0;
        }

        int current = A;
        int squareCount = 0;

        while(current <= B) {
            int sqrt = (int) Math.sqrt(current);
            if(sqrt * sqrt == current) {
                squareCount++;
            }
            current++;
        }

        return squareCount;
    }

    public static void main(String args[]) {
        System.out.println(solution(4, 17));
    }

}
