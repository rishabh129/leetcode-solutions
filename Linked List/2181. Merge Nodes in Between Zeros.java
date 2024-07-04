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
    public ListNode mergeNodes(ListNode head) {
        ListNode temp = head.next;
        int sum=0;
        ListNode tHead = new ListNode(0);
        ListNode t2 = tHead;
        while(temp!=null){
            if(temp.val == 0){
                t2.next = new ListNode(sum);
                sum=0;
                t2=t2.next;
            }
            else{
                sum+=temp.val;
            }
            temp=temp.next;
        }
        return tHead.next;
    }
}