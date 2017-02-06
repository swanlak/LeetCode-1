package idv.carl.leetcode.algorithms.easy.shortesrworddistance;

/**
 * @author Carl Lu
 */
public class Solution {

    public static int shortestDistance(String[] words, String word1, String word2) {
        int n = words.length;
        int idx1 = -1;
        int idx2 = -1;
        int dist = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            if(words[i].equals(word1)) {
                idx1 = i;
            } else if(words[i].equals(word2)) {
                idx2 = i;
            }
            if(idx1 != -1 && idx2 != -1) {
                dist = Math.min(dist, Math.abs(idx1 - idx2));
            }
        }

        return dist;
    }

    public static void main(String args[]) {
        String[] words = {"practice", "makes", "perfect", "coding", "makes"};
        String str1 = words[1];
        String str2 = words[3];
        System.out.println("The min distance between " + str1 + " and " +str2 + " is: " + shortestDistance(words, str1, str2));
    }

}
