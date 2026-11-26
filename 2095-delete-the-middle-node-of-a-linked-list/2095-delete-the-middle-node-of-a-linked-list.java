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
    public ListNode deleteMiddle(ListNode head) {
        if(head== null || head.next==null){
            return null;
        }
        ListNode dummy= new ListNode(0);
        dummy.next=head;
        ListNode fast=dummy;
        ListNode slow=dummy;
        int k=0;

        while(fast.next!=null){
            k++;
            fast=fast.next;
        }

        for(int i=0;i<k/2;i++){
             slow=slow.next;
        }
        slow.next=slow.next.next;
         return head;
    }
}