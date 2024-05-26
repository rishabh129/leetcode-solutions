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
    public ListNode copyList(ListNode h1) {
        ListNode temp = h1;
        ListNode head = new ListNode();
        while(temp != null){
            ListNode tp = new ListNode(temp.val, head);
            head = tp;
            temp = temp.next;
        }
        return head;
    }
    public void reorderList(ListNode head) {
        int size=0;
        ListNode temp=head;
        while(temp != null){
            size++;
            temp=temp.next;
        }
        if(size==1 || size==2){
            return;
        }
        ListNode curr = head;
        temp=head;
        ListNode revHead = copyList(temp);
        ListNode rCurr = revHead;
        ListNode next, rNext;
        for(int i=1;i<size/2;i++){
            next = curr.next;
            rNext = rCurr.next;
            curr.next = rCurr;
            rCurr.next = next;
            curr = next;
            rCurr = rNext;
        }
        curr.next = rCurr;
        if(size%2 ==1){
            curr.next.next = rCurr.next;
            curr=curr.next;
        }
        curr.next.next=null;
    }
}