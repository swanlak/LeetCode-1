package idv.carl.leetcode.algorithms.easy.readncharactersgivenread4;

/**
 * @author Carl Lu
 */
public class Solution {

    /*
     * Time Complexity: O(n)
     * Space Complexity: O(1)
     */
    public static int read(char[] buffer, int expectedTotalReadChars) {
        boolean eof = false;
        int totalReadChars = 0;
        char[] tempBuf = new char[4];

        while (!eof && totalReadChars < expectedTotalReadChars) {
            int currentReadChars = read4(tempBuf);
            eof = currentReadChars < 4;
            currentReadChars = Math.min(currentReadChars, expectedTotalReadChars - totalReadChars);
            for (int i = 0; i < currentReadChars; i++) {
                buffer[totalReadChars++] = tempBuf[i];
            }
        }

        return totalReadChars;
    }

    private static int read4(char[] buffer) {
        // Read 4 characters from a file and write them into  the buffer.
        return 4;
    }
}
