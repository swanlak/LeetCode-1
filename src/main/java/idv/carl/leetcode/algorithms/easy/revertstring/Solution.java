package idv.carl.leetcode.algorithms.easy.revertstring;

/**
 * @author Carl Lu
 */
public class Solution {

    public static void main(String args[]) {
        String input = "Hello World";

        char[] inputArray = input.toCharArray();
        int from = 0;
        int to = inputArray.length - 1;
        char tmp;

        while (to > from) {
            tmp = inputArray[to];
            inputArray[to] = inputArray[from];
            inputArray[from] = tmp;
            to--;
            from++;
        }

        System.out.println(new String(inputArray));
    }

}
