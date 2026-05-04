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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1==null){
            return list2;
        }
        if(list2==null){
            return list1;
        }
        ListNode head;
        ListNode NewList;
        ListNode l1=list1;
        ListNode l2=list2;
        if(l1.val < l2.val){
                head=l1;
                NewList=head;
                l1=l1.next;
        }
        else{
                head=l2;
                NewList=head;
                l2=l2.next;
        }
        while(l1!=null && l2!=null){
            if(l1.val < l2.val){
                NewList.next=l1;
                NewList=l1;
                l1=l1.next;
            }
            else{
                NewList.next=l2;
                NewList=l2;
                l2=l2.next;
            }
        }
        while(l1!=null){
            NewList.next=l1;
            NewList=l1;
            l1=l1.next;
        }
        while(l2!=null){
            NewList.next=l2;
            NewList=l2;
            l2=l2.next;
        }
        return head;
    }
}