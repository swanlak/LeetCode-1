package idv.carl.leetcode.algorithms.easy.flipgame;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Carl Lu
 */
public class Solution {

    public static List<String> generatePossibleNextMoves(String string) {
        List<String> result = new ArrayList<String>();
        if(string.length() < 2 || string == null) {
            return result;
        }

        for (int i = 0; i < string.length() - 1; i++) {
            if(string.charAt(i) == '+' && string.charAt(i+1) == '+') {
                String sub1 = string.substring(0, i);
                String sub2 = "--";
                String sub3 = string.substring(i + 2);
                String temp = sub1 + sub2 + sub3;
                result.add(temp);
            }
        }

        return result;
    }

    public static void main(String args[]) {
        String input = "++++";
        for (String output : generatePossibleNextMoves(input)) {
            System.out.println(output);
        }
    }

}
