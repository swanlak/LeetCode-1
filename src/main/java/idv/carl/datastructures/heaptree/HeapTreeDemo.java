package idv.carl.datastructures.heaptree;

import static java.util.Collections.swap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * @author Carl Lu
 */
public class HeapTreeDemo {

    private static final int OFFSET = 1;

    public static <T extends Comparable<? super T>> int ascending(T t1, T t2) {
        return t1.compareTo(t2);
    }

    public static <T extends Comparable<? super T>> int descending(T t1, T t2) {
        return -ascending(t1, t2);
    }

    public static <T extends Comparable<? super T>> void heapSort(List<T> list) {
        heapSort(list, HeapTreeDemo::ascending);
    }

    public static <T> void heapSort(List<T> list, Comparator<? super T> comparator) {
        heapTree(list, comparator);
        selectFromHeap(list, comparator);
    }

    /*
     * To build up a heap tree
     */
    private static <T> void heapTree(List<T> list, Comparator<? super T> comparator) {
        for (int i = 1, end = list.size() + 1; i < end; i++) {
            bubbleLeaf(list, i, comparator);
        }
    }

    private static <T> void selectFromHeap(List<T> list, Comparator<? super T> comparator) {
        for (int end = list.size(); end > OFFSET; end--) {
            swap(list, 1 - OFFSET, end - OFFSET);
            bubbleRoot(list, end, comparator);
        }
    }

    /*
     * To see if there is any node on the path from rootIndex to elementIndex can be bubble up
     */
    private static <T> void bubbleLeaf(List<T> list, int elementIndex, Comparator<? super T> comparator) {
        for (int childIndex = elementIndex, parentIndex = elementIndex / 2; canBubbleUp(list, childIndex, parentIndex,
                comparator); childIndex = parentIndex, parentIndex = childIndex / 2) {
            swap(list, parentIndex - OFFSET, childIndex - OFFSET);
        }
    }

    /*
     * If the child node is not the root, and the value of parent < child,
     * it means that the child node can be bubble up.
     */
    private static <T> boolean canBubbleUp(List<T> list, int childIndex, int parentIndex, Comparator<? super T> comparator) {
        return childIndex > OFFSET && comparator.compare(list.get(parentIndex - OFFSET), list.get(childIndex - OFFSET)) < 0;
    }

    private static <T> void bubbleRoot(List<T> list, int end, Comparator<? super T> comparator) {
        for (int parentIndex = 0 + OFFSET, childIndex = indexFromChildren(list, parentIndex, end, comparator); childIndex < end
                && comparator.compare(list.get(childIndex - OFFSET), list.get(parentIndex - OFFSET)) > 0; parentIndex =
                        childIndex, childIndex = indexFromChildren(list, parentIndex, end, comparator)) {
            swap(list, parentIndex - OFFSET, childIndex - OFFSET);
        }
    }

    private static <T> int indexFromChildren(List<T> list, int parentIndex, int end, Comparator<? super T> comparator) {
        int childIndex = parentIndex * 2;
        // If left child > right child, return left child (depends on comparator)
        return isRightLeafSuitable(list, childIndex, end, comparator) ? childIndex + 1 : childIndex;
    }

    private static <T> boolean isRightLeafSuitable(List<T> list, int childIndex, int end, Comparator<? super T> comparator) {
        return childIndex < end - 1 && comparator.compare(list.get(childIndex + 1 - OFFSET), list.get(childIndex - OFFSET)) > 0;
    }

    public static void main(String args[]) {
        List<Integer> list = new ArrayList<Integer>(Arrays.asList(10, 9, 1, 2, 5, 3, 8, 7, 12, 11));
        heapSort(list);
        System.out.println(list);

        // heapSort(list, HeapTreeDemo::descending);
        // System.out.println(list);
    }

}
