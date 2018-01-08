package idv.carl.leetcode.algorithms.easy.mergetwosortedlists;

/**
 * @author Carl Lu
 */
public class Solution {

    /*
     * Time Complexity: O(n + m)
     * Space Complexity: O(1)
     */
    public static Node mergeTwoLists(Node list1, Node list2) {
        Node dummyHead = new Node(0);
        Node current = dummyHead;
        while (list1 != null && list2 != null) {
            if (list1.value < list2.value) {
                current.next = list1;
                list1 = list1.next;
            } else {
                current.next = list2;
                list2 = list2.next;
            }

            current = current.next;
        }

        current.next = ( list1 != null ) ? list1 : list2;
        return dummyHead.next;
    }

    public static String dumpListValue(Node node) {
        StringBuilder result = new StringBuilder();
        if (node != null) {
            result.append(node.value);
            while (node.next != null) {
                result.append(node.next.value);
                node = node.next;
            }
        }

        return result.toString();
    }

}
