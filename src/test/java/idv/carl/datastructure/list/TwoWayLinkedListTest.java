package idv.carl.datastructure.list;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import idv.carl.datastructures.list.TwoWayLinkedList;

/**
 * @author Carl Lu
 */
public class TwoWayLinkedListTest {

    @Test
    public void test() {
        TwoWayLinkedList twoWayLinkedList = new TwoWayLinkedList();

        twoWayLinkedList.insertHead(1);
        twoWayLinkedList.insertHead(2);
        twoWayLinkedList.insertHead(3);

        twoWayLinkedList.displayList();

        assertEquals(2, twoWayLinkedList.find(2).getId());

        assertEquals(3, twoWayLinkedList.removeHead().getId());
        assertEquals(2, twoWayLinkedList.removeHead().getId());
        assertEquals(1, twoWayLinkedList.removeHead().getId());
        assertEquals(null, twoWayLinkedList.removeHead());

        twoWayLinkedList.insertHead(1);
        twoWayLinkedList.insertTail(2);
        twoWayLinkedList.insertTail(3);

        assertEquals(1, twoWayLinkedList.removeHead().getId());
        assertEquals(2, twoWayLinkedList.removeHead().getId());
        assertEquals(3, twoWayLinkedList.removeHead().getId());
    }

}
