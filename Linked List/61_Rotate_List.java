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
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null){
            return null;
        }
        if(head.next==null || k==0){
            return head;
        }
        int size=0;
        ListNode temp = head;
        ListNode tail = head;

        while(temp!=null){
            if(temp.next == null){
                tail = temp;
            }
            temp=temp.next;
            size++;
        }

        temp=head;
        k=k%size;
        if(k==0){
            return head;
        }

        for(int i=0;i<size-k-1;i++){
            temp=temp.next;
        }

        ListNode tHead = temp.next;
        temp.next=null;
        tail.next=head;
        
        return tHead;

    }
}