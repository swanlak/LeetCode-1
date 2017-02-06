package idv.carl.leetcode.algorithms.medium.maximumproductofwordlengths;

/**
 * @author Carl Lu
 */
public class Solution {

    public int maxProduct(String[] words) {
        if (words == null || words.length == 0)
            return 0;
        int[] value = preProcess(words);
        return calculateMaxProduct(value, words);
    }

    private int[] preProcess(String[] words) {
        int len = words.length;
        int[] value = new int[len];
        for (int i = 0; i < len; i++) {
            String tmp = words[i];
            value[i] = 0;
            for(int j = 0; j < tmp.length(); j++) {
                /**
                 *  b1 |= b2;
                 *  is equivalent to
                 *  b1 = b1 | b2;
                 *
                 *  Here I want to use a int array to record the character set (non-duplicated set) for each word,
                 *  we don't care how many times of a character occurs in one word,
                 *  we just want to record what letters occurs in one word,
                 *  so that we can use AND operation (&) to compare if two words has the same letter afterwards.
                 *  If you still cannot get the idea, comment out the System.our.println() functions below and
                 *  run the program, you will see the reason.
                 */
                value[i] |= 1 << tmp.charAt(j) - 'a';
                /*System.out.println(tmp.charAt(j) + ", " + (tmp.charAt(j) - 'a') + ", " + (1 << (tmp.charAt(j) - 'a')) + ", " + value[i]);
                System.out.println(Integer.toBinaryString(tmp.charAt(j)) + ", " +
                                    Integer.toBinaryString((tmp.charAt(j) - 'a')) + ", " +
                                    Integer.toBinaryString((1 << (tmp.charAt(j) - 'a'))) + ", " +
                                    Integer.toBinaryString(value[i]));*/
            }
        }
        return value;
    }

    private int calculateMaxProduct(int[] value, String[] words) {
        int maxProduct = 0;
        for(int i = 0; i < value.length; i++) {
            for (int j = i + 1; j < value.length; j++) {
                if((value[i] & value[j]) == 0 && (words[i].length() * words[j].length() > maxProduct)) {
                    maxProduct = words[i].length() * words[j].length();
                }
            }
        }
        return maxProduct;
    }

    public static void main(String args[]) {
        String[] intput = new String[] {"abcw", "baz", "foo", "bar", "xtfn", "abcdef"};
        Solution solution = new Solution();
        System.out.println(solution.maxProduct(intput));
    }

}
