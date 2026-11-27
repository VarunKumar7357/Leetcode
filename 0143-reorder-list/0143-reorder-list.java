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

         if (head == null || head.next == null) {
            return;
        }
        ListNode slow=head;
        ListNode fast=head;
        
        while(fast.next!=null && fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
       
        ListNode head1= reverse(slow.next);
        slow.next=null;
        ListNode head2=head;
        while(head1!=null){
            ListNode Hfar=head2.next;
            ListNode H1far=head1.next;
            head2.next=head1;
            head1.next=Hfar;
            head2=Hfar;
            head1=H1far;
        }
    }
    public ListNode reverse(ListNode head){
        ListNode prev=null;
        ListNode cur=head;

        while(cur!=null){
            ListNode farward= cur.next;
            cur.next=prev;
            prev=cur;
            cur=farward;
        }
        return prev;
    }
}