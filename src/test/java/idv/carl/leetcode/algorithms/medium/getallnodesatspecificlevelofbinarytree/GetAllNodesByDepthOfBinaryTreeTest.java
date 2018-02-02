package idv.carl.leetcode.algorithms.medium.getallnodesatspecificlevelofbinarytree;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * @author Carl Lu
 */
public class GetAllNodesByDepthOfBinaryTreeTest {

    @Test
    public void test() {
        /*
         *           23           --- Level 0
         *         /   \
         *       10    15         --- Level 1
         *       /\    / \
         *     20 25  30 35       --- Level 2
         *     /   \   \  \
         *    12   14  65  9      --- Level 3
         *         /\   \   \
         *        1  3  21  100   --- Level 4
         *             / \   \
         *            42  33  55  --- Level 5
         *                / \
         *               77 88    --- Level 6
         */
        Node root = new Node(23);

        root.left = new Node(10);
        root.left.left = new Node(20);
        root.left.left.left = new Node(12);
        root.left.right = new Node(25);
        root.left.right.right = new Node(14);
        root.left.right.right.left = new Node(1);
        root.left.right.right.right = new Node(3);

        root.right = new Node(15);
        root.right.left = new Node(30);
        root.right.left.right = new Node(65);
        root.right.left.right.right = new Node(21);
        root.right.left.right.right.left = new Node(42);
        root.right.left.right.right.right = new Node(33);
        root.right.left.right.right.right.left = new Node(77);
        root.right.left.right.right.right.right = new Node(88);
        root.right.right = new Node(35);
        root.right.right.right = new Node(9);
        root.right.right.right.right = new Node(100);
        root.right.right.right.right.right = new Node(55);

        Solution solution = new Solution();
        List<ListNode> allNodesInTreeByDepth = solution.getAllNodesByDepthOfBinaryTree(root);
        solution.displayAllNodesByDepth(allNodesInTreeByDepth);

        for (int i = 0; i < allNodesInTreeByDepth.size(); i++) {
            System.out.printf("\nDisplay nodes at depth %d: ", i);
            solution.displayNodesAtSpecificDepth(i);
        }

        int expectedSizeOfLevel0 = 1;
        int expectedSizeOfLevel1 = 2;
        int expectedSizeOfLevel2 = 4;
        int expectedSizeOfLevel3 = 4;
        int expectedSizeOfLevel4 = 4;
        int expectedSizeOfLevel5 = 3;
        int expectedSizeOfLevel6 = 2;

        assertEquals(expectedSizeOfLevel0, solution.getSizeOfDepth(0));
        assertEquals(expectedSizeOfLevel1, solution.getSizeOfDepth(1));
        assertEquals(expectedSizeOfLevel2, solution.getSizeOfDepth(2));
        assertEquals(expectedSizeOfLevel3, solution.getSizeOfDepth(3));
        assertEquals(expectedSizeOfLevel4, solution.getSizeOfDepth(4));
        assertEquals(expectedSizeOfLevel5, solution.getSizeOfDepth(5));
        assertEquals(expectedSizeOfLevel6, solution.getSizeOfDepth(6));
    }

}
