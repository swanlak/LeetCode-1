package idv.carl.leetcode.algorithms.easy.palindromepermutation;

/**
 * @author Carl Lu
 */
public class Solution {

    public static boolean canPermutePalindrome(String string) {
        int length = string.length();
        if(length == 0 || length == 1) {
            return true;
        }

        int[] count = new int[128];
        int odd = 0;

        for(int i = 0 ; i < length ; i++) {
            count[string.charAt(i)]++;
            if(count[string.charAt(i)] % 2 == 1) {
                odd++;
            } else {
                odd--;
            }
        }
        return (odd == 0 || odd == 1) ? true : false;
    }

    public static void main(String args[]) {
        String input = "ivicc";
        System.out.println(input + " can permute palindrome: " + canPermutePalindrome(input));
    }

}
