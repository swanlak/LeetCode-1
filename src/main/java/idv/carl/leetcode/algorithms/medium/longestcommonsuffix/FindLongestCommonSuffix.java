package idv.carl.leetcode.algorithms.medium.longestcommonsuffix;

/**
 * @author Carl Lu
 */
public class FindLongestCommonSuffix {

    /*
     * This is solved by dynamic programming.
     */
    public static String findLongestCommonSuffix(String str1, String str2) {
        StringBuilder result = new StringBuilder();

        if (isValidString(str1) && isValidString(str2)) {
            int[][] num = new int[str1.length()][str2.length()];
            int maxLength = 0;
            int lastSubStringBegin = 0;

            for (int i = 0; i < str1.length(); i++) {
                for (int j = 0; j < str2.length(); j++) {
                    // If the chars matched
                    if (str1.charAt(i) == str2.charAt(j)) {
                        if ((i == 0) || (j == 0)) {
                            num[i][j] = 1;
                        } else {
                            num[i][j] = 1 + num[i - 1][j - 1];
                        }

                        if (num[i][j] > maxLength) {
                            // Reset the max length if the new max length is grater than the old one
                            maxLength = num[i][j];
                            int theSubStringBegin = i - num[i][j] + 1;
                            /*
                             * If the new detected substring is derived from the last result, just
                             * append the char at the result
                             */
                            if (lastSubStringBegin == theSubStringBegin) {
                                result.append(str1.charAt(i));
                            } else {
                                /*
                                 * However, if the new detected substring is derived from the new
                                 * start point, the result should be updated
                                 */
                                lastSubStringBegin = theSubStringBegin;
                                result = new StringBuilder();
                                result.append(str1.substring(lastSubStringBegin, i + 1));
                            }
                        }
                    }
                }
            }

            String resultStr = result.toString();
            if (resultStr.length() == 0 || !isSuffix(resultStr, str1, str2)) {
                return "NULL";
            } else {
                return resultStr;
            }

        } else {
            return "NULL";
        }
    }

    private static boolean isValidString(String input) {
        return !(input == null || input.isEmpty());
    }

    private static boolean isSuffix(String result, String str1, String str2) {
        boolean isSuffix = false;
        int lengthOfResult = result.length();
        String str1Sub = str1.substring(str1.length() - lengthOfResult);
        String str2Sub = str2.substring(str2.length() - lengthOfResult);

        if (str1Sub.equals(str2Sub)) {
            isSuffix = true;
        }

        return isSuffix;
    }
}
