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
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        int size = 0;
        ListNode temp = head;
        int[] ans = new int[2];

        while(temp!=null){
            size++;
            temp=temp.next;
        }

        if(size<4){
            ans[0]=ans[1]=-1;
            return ans;
        }

        ListNode curr=head.next;
        ListNode prev = head;
        ListNode next;

        int idx = 2;
        int first = 0;
        int pv = 0;
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;

        while(curr!=null && curr.next!=null){

            next = curr.next;

            if((curr.val < prev.val && curr.val < next.val) || (curr.val > prev.val && curr.val > next.val)){
                
                if(first==0){
                    first = idx;
                }
                else if(min==Integer.MAX_VALUE){
                    min = idx-first;
                }
                else{
                    min = Math.min(min, idx-pv);
                }
                pv = idx;
            }
            idx++;
            prev=curr;
            curr=next;
            next=curr.next;
        }

        if(first == pv){
            ans[0]=ans[1]=-1;
            return ans;
        }
        ans[0] = min;
        ans[1] = pv-first;
        return ans;
    }
}