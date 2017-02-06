package idv.carl.leetcode.algorithms.easy.longestsubsequenceofintlist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Carl Lu
 */
public class Solution {

    public static List<Integer> getLongestSubsequence(List<Integer> list) {
        List<Integer> result = new ArrayList<Integer>();
        List<Integer> temp = new ArrayList<Integer>();

        if(list != null) {
            for (int i = 0 ; i < list.size(); i++) {
                if(i == list.size() - 1) {
                    if(list.get(i) != 0)
                        temp.add(list.get(i));
                    if(temp.size() > result.size())
                        result = new ArrayList<Integer>(temp);
                }else if(list.get(i) == 0) {
                    if(temp.size() > result.size())
                        result = new ArrayList<Integer>(temp);
                    temp.clear();
                } else {
                    temp.add(list.get(i));
                }
            }
        }

        return result;
    }

    public static void main(String args[]) {
        Integer[] intArray = {23, 12, 57, 0,
                              88, 102, 343, 21, 223, 0,
                              354, 7678, 324, 56, 2, 77, 34, 5, 3123, 76, 34, 34, 54, 7, 0,
                               1, 2, 3, 4, 5, 6, 7, 8, 0,
                              12, 6, 8, 12, 45, 54};
        List<Integer> list = Arrays.asList(intArray);
        StringBuffer result = new StringBuffer();
        for(Integer integer : getLongestSubsequence(list)) {
            result.append(String.valueOf(integer) + ", ");
        }
        System.out.print(result.subSequence(0, result.length() - 2));
    }

}
