package idv.carl.datastructure.binarytree;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import idv.carl.datastructures.binarytree.BinaryTree;
import idv.carl.datastructures.binarytree.Node;

/**
 * @author Carl Lu
 */
public class BinaryTreeTest {

    private BinaryTree binaryTree;

    @Before
    public void init() {
        binaryTree = new BinaryTree();
        binaryTree.insert(6, 6);
        binaryTree.insert(5, 5);
        binaryTree.insert(8, 8);
        binaryTree.insert(3, 3);
        binaryTree.insert(7, 7);
        binaryTree.insert(9, 9);
    }

    @Test
    public void testInOrder() {
        binaryTree.inOrder(binaryTree.find(6));
    }

    @Test
    public void findMin() {
        Node min = binaryTree.getMinNode();
        assertEquals(min.getId(), 3);
    }

    @Test
    public void findMax() {
        Node max = binaryTree.getMaxNode();
        assertEquals(max.getId(), 9);
    }

    @Test
    public void delete() {
        assertTrue(binaryTree.find(8) != null);
        binaryTree.delete(8);
        assertTrue(binaryTree.find(8) == null);
    }
}
