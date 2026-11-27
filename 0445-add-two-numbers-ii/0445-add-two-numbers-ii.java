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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
       
       ListNode dummy= reverse(l1);
       ListNode dummy2= reverse(l2);
       ListNode dum= new ListNode(0);
       ListNode cur=dum;
       int carry=0;

       while(dummy!=null || dummy2!=null || carry>0){
             int sum=carry;
             if(dummy!=null){
                sum+=dummy.val;
                dummy=dummy.next;
             }
            if(dummy2!=null){
                sum+=dummy2.val;
                dummy2=dummy2.next;
             }
             carry= sum/10;
             cur.next= new ListNode(sum%10);
             cur=cur.next;

       }
        return reverse(dum.next);
    }

    public ListNode reverse(ListNode l1){
        ListNode cur=l1;
        ListNode prev=null;

        while(cur!=null){
            ListNode farward=cur.next;
            cur.next=prev;
            prev=cur;
            cur=farward;
        }
        return prev;
    }
}