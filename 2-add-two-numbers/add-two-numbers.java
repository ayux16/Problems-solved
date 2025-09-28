class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode t=new ListNode(-1);
        ListNode temp=t;
        int c=0;
        int s=0;
        while(l1!=null || l2!=null || c!=0){
            s=c;
            if(l1!=null){
                s=s+l1.val;
                l1=l1.next;
            }
            if(l2!=null){
                s=s+l2.val;
                l2=l2.next;
            }
            int x=s%10;
            c=s/10;
            
            ListNode nn=new ListNode(x);
            temp.next=nn;
            temp=temp.next;
            
        }
        return t.next;
    }
}