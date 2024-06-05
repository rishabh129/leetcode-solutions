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
    ListNode kth(ListNode temp, int k){
        int i=0;

        while(temp!=null){
            i++;
            if(k==i){
                return temp;
            }
            temp=temp.next;
        }
        return null;
    }
    void reverse(ListNode temp){
        ListNode prev=null;
        ListNode curr = temp;
        ListNode next;

        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        
    }
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode temp = head;
        ListNode prev = null;
        ListNode nextNode;
        ListNode kth;
        while(temp!=null){
            kth = kth(temp, k);
            if(kth==null){
                if(prev!=null)
                prev.next = temp;
                break;
            }

            nextNode = kth.next;
            kth.next=null;
            reverse(temp);
            if(temp==head){
                head = kth;
            }
            else{
                prev.next=kth;
            }
            prev=temp;
            temp=nextNode;
        }
        return head;
    }
}