package idv.carl.leetcode.algorithms.easy.maximumdepthofbinarytree;

/**
 * @author Carl Lu
 *
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {

    public static int maxDepth(TreeNode root) {
        if(root == null) {
            return 0;
        }

        int leftLength = maxDepth(root.left);
        int rightLength = maxDepth(root.right);

        if(leftLength > rightLength) {
            return leftLength + 1;
        }

        return rightLength + 1;
    }

}