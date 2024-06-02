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
    ListNode merge2LL(ListNode list1, ListNode list2){
        ListNode temp1 = list1;
        ListNode temp2 = list2;

        ListNode merge = new ListNode(-1);
        ListNode temp = merge;

        while(temp1!=null && temp2!=null){

            if(temp1.val < temp2.val){
                temp.next = temp1;
                temp1 = temp1.next;
            }
            else{
                temp.next = temp2;
                temp2 = temp2.next;
            }
            temp=temp.next;
        }

        while(temp1!=null){
            temp.next=temp1;
            temp1=temp1.next;
            temp=temp.next;
        }
        while(temp2!=null){
            temp.next=temp2;
            temp2=temp2.next;
            temp=temp.next;
        }
        return merge.next;
    }
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists.length == 0){
            return null;
        }
        if(lists.length == 1){
            return lists[0];
        }
        ListNode sorted = merge2LL(lists[0], lists[1]);

        for(int i=2;i<lists.length;i++){
            sorted = merge2LL(sorted, lists[i]);
        }
        return sorted;
    }
}