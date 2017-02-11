package idv.carl.datastructures.list;

import java.util.Arrays;

/**
 * @author Carl Lu
 */
public class SortByOrderedLinkedList {

    public int[] sort(int[] data) {
        int[] result = new int[data.length];
        OrderedLinkedList orderedLinkedList = new OrderedLinkedList();
        // Step1. Add the data into list sequentially
        Arrays.stream(data).forEach(d -> orderedLinkedList.insertHead(d));
        // Step2. Obtain all the data from list sequentially
        int index = 0;
        while (!orderedLinkedList.isEmpty()) {
            result[index++] = orderedLinkedList.removeHead().getId();
        }
        return result;
    }

}
