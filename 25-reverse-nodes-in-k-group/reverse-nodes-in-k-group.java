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
    public ListNode reverseKGroup(ListNode head, int k) {
        int len=0;
        ListNode temp=head;
        while(temp!=null && len<k){
            temp=temp.next;
            len++;
        }
        if(len<k){
            return head;
        }

        int n=k;
        ListNode tail=head;
        ListNode start=reverse(head,n);
        tail.next=reverseKGroup(temp,n);
        return start;

    }
    public ListNode reverse(ListNode head, int k){
        ListNode cur=head;
        ListNode prev=null;
        while(k--!=0 && cur!=null){
            ListNode nn=cur;
            cur=cur.next;
            nn.next=prev;
            prev=nn;
        }
        return prev;
    }
}