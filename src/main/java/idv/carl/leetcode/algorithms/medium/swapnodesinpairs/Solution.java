package idv.carl.leetcode.algorithms.medium.swapnodesinpairs;

/**
 * @author Carl Lu
 */
public class Solution {

    /*
     * Time Complexity: O(n)
     * Space Complexity: O(1)
     */
    public static Node swapPairs(Node head) {
        Node dummyHead = new Node(0);
        dummyHead.next = head;
        Node currentNode = dummyHead;
        Node firstNode = head;

        while (firstNode != null && firstNode.next != null) {
            Node secondNode = firstNode.next;
            Node thirdNode = firstNode.next.next;
            currentNode.next = secondNode;
            secondNode.next = firstNode;
            firstNode.next = thirdNode;
            currentNode = firstNode;
            firstNode = thirdNode;
        }

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
