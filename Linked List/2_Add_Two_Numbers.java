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
    public ListNode reverseList(ListNode head) {
         ListNode prev = null;
         ListNode curr = head;
         ListNode next;
         while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
         }
         return prev;
    }

    public int checkSize(ListNode l1){
        int size = 0;

        ListNode temp = l1;
        while(temp != null){
            size++;
            temp=temp.next;
        }
        return size;
    }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        // l1 = reverseList(l1);
        // l2 = reverseList(l2);

        int s1 = checkSize(l1);
        int s2 = checkSize(l2);

        int len = (s1>s2)?s2:s1;

        ListNode t1 = l1, t2 = l2;
        ListNode head = new ListNode();
        int i=0,sum=0,carry=0;
        for(i=0;i<len;i++){
            sum = t1.val + t2.val + carry;
            if(sum>9){
                carry = 1;
                sum%=10;
            }
            else{
                carry=0;
            }
            ListNode temp = new ListNode(sum,head);
            head = temp;
            t1=t1.next;
            t2=t2.next;
        }

        if(s1>s2){
            for(;i<s1;i++){
                sum = t1.val + carry;
                if(sum>9){
                    carry = 1;
                    sum%=10;
                }
                else{
                    carry=0;
                }
                ListNode temp = new ListNode(sum,head);
                head = temp;
                t1=t1.next;
            }
        }
        else if(s1<s2){
            for(;i<s2;i++){
                sum = t2.val + carry;
                if(sum>9){
                    carry = 1;
                    sum%=10;
                }
                else{
                    carry=0;
                }
                ListNode temp = new ListNode(sum,head);
                head = temp;
                t2=t2.next;
            }
        }

        if(carry == 1){
            ListNode temp = new ListNode(carry,head);
            head = temp;
        }
        head = reverseList(head);
        head=head.next;
        return head;
    }
}