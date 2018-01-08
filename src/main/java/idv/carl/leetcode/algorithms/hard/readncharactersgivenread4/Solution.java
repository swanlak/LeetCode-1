package idv.carl.leetcode.algorithms.hard.readncharactersgivenread4;

/**
 * @author Carl Lu
 */
public class Solution {

    private char[] tempBuff = new char[4];
    private int tempBuffCount = 0;
    private int tempBuffPointer = 0;

    /*
     * Time Complexity: O(n)
     * Space Complexity: O(1)
     * */
    public int read(char[] buffer, int expectedTotalReadChars) {
        int total = 0;
        while (expectedTotalReadChars > total) {

            if (tempBuffPointer == 0) {
                tempBuffCount = read4(tempBuff);
            }

            if (tempBuffCount == 0) {
                break;
            }

            while (expectedTotalReadChars > total && tempBuffPointer < tempBuffCount) {
                buffer[total++] = tempBuff[tempBuffPointer++];
            }

            if (tempBuffPointer >= tempBuffCount) {
                tempBuffPointer = 0;
            }
        }
        return total;
    }

    private int read4(char[] buffer) {
        // Read 4 characters from a file and write them into  the buffer.
        return 4;
    }

}
