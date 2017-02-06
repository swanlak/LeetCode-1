package idv.carl.leetcode.algorithms.easy.maximumdepthofbinarytree;

/**
 * @author Carl Lu
 */
public class Solution2 {

    public static int maxDepth(TreeNode root) {
        if(root == null) {
            return 0;
        }
        return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
    }

}
