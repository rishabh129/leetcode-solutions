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
    ListNode mid(ListNode head){
        ListNode slow=head;
        ListNode fast=head.next;

        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
    ListNode merge(ListNode head1, ListNode head2){
        ListNode merged = new ListNode(-1);
        ListNode temp = merged;

        while(head1!=null && head2!=null){
            if(head1.val<head2.val){
                temp.next=head1;
                head1=head1.next;
                temp=temp.next;
            }
            else{
                temp.next = head2;
                head2=head2.next;
                temp=temp.next;
            }
        }
        while(head1!=null){
            temp.next=head1;
            head1=head1.next;
            temp=temp.next;
        }
        while(head2!=null){
            temp.next = head2;
                head2=head2.next;
                temp=temp.next;
        }
        return merged.next;
    }
    ListNode mergeSort(ListNode head){
        if(head == null || head.next == null){
            return head;
        }
        ListNode mid = mid(head);
        ListNode rightHead = mid.next;
        mid.next=null;

        ListNode leftH = mergeSort(head);
        ListNode rightH = mergeSort(rightHead);
        return merge(leftH, rightH);
    }
    public ListNode sortList(ListNode head) {
        return mergeSort(head);
    }
}