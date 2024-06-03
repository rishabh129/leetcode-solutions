/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public void deleteNode(ListNode node) {
        // all values are unique
        node.val = node.next.val; // copy the value of the next node to the current node
        node.next = node.next.next; // delete the next node
    }
}