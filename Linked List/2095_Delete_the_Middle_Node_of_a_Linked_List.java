/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode deleteMiddle(ListNode head) {

        if(head.next==null){
            return null;
        }
        if(head.next.next == null){ // if there are only two nodes - delete the 2nd node
            head.next=null;
            return head;
        }

        ListNode slow=head;
        ListNode fast=head;

        while(fast!=null && fast.next!=null){ // find the middle node
            slow=slow.next;
            fast = fast.next.next;
        }
        
        slow.val=slow.next.val; // copy the value of the next node to the middle node
        slow.next=slow.next.next; // delete the next node
        return head;
    }
}