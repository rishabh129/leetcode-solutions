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
    ListNode reverse(ListNode head){

        ListNode curr=head;
        ListNode prev=null;

        while(curr!=null){

            ListNode nxt=curr.next;
            curr.next=prev;
            prev=curr;
            curr=nxt;

        }
        return prev;

    }
    public ListNode reverseBetween(ListNode head, int left, int right) {

        if(left==right){
            return head;
        }
        int size=1;

        ListNode temp=head;
        
        while(temp!=null && temp.next!=null){
            size++;
            temp=temp.next;
        }
        if(left==1 && right==size){
            return reverse(head);
        }

        temp=head;
        ListNode start=null;
        
        for(int i=1;i<left;i++){
            start=temp;
            temp=temp.next;
        }

        ListNode rev=temp;

        ListNode end=null;
        temp=head;
        for(int i=1;i<right;i++){
            temp=temp.next;
            end=temp.next;
        }
        temp.next=null;

        if(start==null){
            head=reverse(rev);
        }
        else{
            start.next=reverse(rev);
        }
        temp=head;

        while(temp!=null & temp.next!=null){

            temp=temp.next;

        }

        temp.next=end;
        return head;


    }
}