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
    public void reorderList(ListNode head) {
        if(head==null || head.next==null) return;
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode rev=reverse(slow.next);
        slow.next=null;
        ListNode temp=head;
        while(rev!=null){
            ListNode t1=head.next;
            ListNode t2=rev.next;

            head.next=rev;
            rev.next=t1;
            
            head=t1;
            rev=t2;
        }
    }
    public static ListNode reverse(ListNode head){
        ListNode cur=head;
        ListNode rev=null;
        while(cur!=null){
            ListNode temp=cur;
            cur=cur.next;
            temp.next=rev;
            rev=temp;
        }
        return rev;
    }
}