/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    int size(ListNode head){
        ListNode temp = head;

        int s=0;
        while(temp!=null){
            s++;
            temp=temp.next;
        }
        return s;
    }
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode temp1 = headA;
        ListNode temp2 = headB;

        int size1 = size(headA);
        int size2 = size(headB);

        if(size1>size2){
            for(int i=0;i<size1-size2;i++){
                temp1=temp1.next;
            }
        }
        else if(size2>size1){
            for(int i=0;i<size2-size1;i++){
                temp2=temp2.next;
            }
        }

        while(temp1!=null){
            if(temp1==temp2){
                return temp1;
            }
            temp1=temp1.next;
            temp2=temp2.next;
        }
        return null;
    }
}