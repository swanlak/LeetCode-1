package idv.carl.datastructure.rbtree;

import static org.junit.Assert.assertArrayEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import idv.carl.datastructures.rbtree.RbTree;

/**
 * @author Carl Lu
 */
public class RbTreeTest {

    private final Object[] expectedForNormalCase = new Object[] {6, 5, 3, 8, 7, 9};
    private final Object[] expectedForSortedCase = new Object[] {2, 1, 4, 3, 5, 6};
    private final Object[] expectedForDeleteCase = new Object[] {6, 5, 3, 9, 7};
    private final Object[] expectedForDeleteRootCase = new Object[] {7, 5, 3, 8, 9};

    @Test
    public void testInsertOperationForNormalCase() {
        RbTree rbTree = new RbTree();

        rbTree.insert(6, 6);
        rbTree.insert(5, 5);
        rbTree.insert(8, 8);
        rbTree.insert(3, 3);
        rbTree.insert(7, 7);
        rbTree.insert(9, 9);

        // rbTree.preOrder(rbTree.getRoot());

        List<Integer> list = new ArrayList<>();
        Object[] result = rbTree.getPreOrderList(list, rbTree.getRoot()).toArray();
        assertArrayEquals(expectedForNormalCase, result);
    }

    @Test
    public void testInsertOperationForSortedList() {
        RbTree rbTree = new RbTree();

        rbTree.insert(1, 1);
        rbTree.insert(2, 2);
        rbTree.insert(3, 3);
        rbTree.insert(4, 4);
        rbTree.insert(5, 5);
        rbTree.insert(6, 6);

        // rbTree.preOrder(rbTree.getRoot());

        List<Integer> list = new ArrayList<>();
        Object[] result = rbTree.getPreOrderList(list, rbTree.getRoot()).toArray();
        assertArrayEquals(expectedForSortedCase, result);
    }

    @Test
    public void testDelete() {
        RbTree rbTree = new RbTree();

        rbTree.insert(6, 6);
        rbTree.insert(5, 5);
        rbTree.insert(8, 8);
        rbTree.insert(3, 3);
        rbTree.insert(7, 7);
        rbTree.insert(9, 9);

        rbTree.delete(8);

        // rbTree.preOrder(rbTree.getRoot());

        List<Integer> list = new ArrayList<>();
        Object[] result = rbTree.getPreOrderList(list, rbTree.getRoot()).toArray();
        assertArrayEquals(expectedForDeleteCase, result);
    }

    @Test
    public void testDeleteRoot() {
        RbTree rbTree = new RbTree();

        rbTree.insert(6, 6);
        rbTree.insert(5, 5);
        rbTree.insert(8, 8);
        rbTree.insert(3, 3);
        rbTree.insert(7, 7);
        rbTree.insert(9, 9);

        rbTree.delete(6);

        // rbTree.preOrder(rbTree.getRoot());

        List<Integer> list = new ArrayList<>();
        Object[] result = rbTree.getPreOrderList(list, rbTree.getRoot()).toArray();
        assertArrayEquals(expectedForDeleteRootCase, result);
    }

}
