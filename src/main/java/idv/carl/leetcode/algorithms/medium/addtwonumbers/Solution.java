package idv.carl.leetcode.algorithms.medium.addtwonumbers;

/**
 * @author Carl Lu
 */
public class Solution {

    /*
     * Time Complexity: O(max(n, m))
     * Space Complexity: O(max(n, m))
     */
    public static Node addTwoNumbers(Node input1, Node input2) {
        Node dummyNode = new Node(0);
        Node current = dummyNode;
        int carry = 0;

        while (input1 != null || input2 != null) {
            int valueOfInput1 = ( input1 != null ) ? input1.value : 0;
            int valueOfInput2 = ( input2 != null ) ? input2.value : 0;
            int sumOfInputValue = carry + valueOfInput1 + valueOfInput2;
            carry = sumOfInputValue / 10;
            current.next = new Node(sumOfInputValue % 10);
            current = current.next;
            if (input1 != null) {
                input1 = input1.next;
            }

            if (input2 != null) {
                input2 = input2.next;
            }
        }

        if (carry > 0) {
            current.next = new Node(carry);
        }

        return dummyNode.next;
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
