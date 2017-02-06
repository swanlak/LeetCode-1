package idv.carl.leetcode.algorithms.easy.wholesquare;

/**
 * @author Carl Lu
 */
public class Solution2 {

    public static int solution(int A, int B) {

        if(A > B) {
            return 0;
        }

        int current = A;
        int squareCount = 0;

        while(current <= B) {
            double sqrt = Math.sqrt(current);
            if(sqrt == (int) sqrt) {
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
