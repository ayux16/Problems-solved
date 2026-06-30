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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (head == null) {
            return null;
        }
        ListNode rev=reverse(head);
        rev=removeAtIndex(rev,n-1);
        return reverse(rev);
    }
    public static ListNode removeAtIndex(ListNode head,int n){
        if (head == null) {
            return null;
        }
        if (n == 0) {
            return head.next;
        }
         ListNode cur = head;
        for(int i=0; i<n-1 && cur!=null; i++){
            cur=cur.next;
        }
        if(cur==null || cur.next==null){
            return head;
        }
        cur.next=cur.next.next;
        return head;
    }
    public static ListNode reverse(ListNode head){
        ListNode cur=head;
        ListNode rev=null;
        while(cur!=null){
            ListNode nn=cur;
            cur=cur.next;
            nn.next=rev;
            rev=nn;
        }
        return rev;
    }
}