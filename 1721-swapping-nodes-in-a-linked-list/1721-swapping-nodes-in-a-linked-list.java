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
    public ListNode swapNodes(ListNode head, int k) {
        ListNode dummy= new ListNode(0);
        dummy.next=head;
        ListNode cur=head;
        ListNode prev1=dummy;
        
        for(int i=1;i<k;i++){
            prev1=cur;
            cur=cur.next;
        }
        ListNode prev2=dummy;
        ListNode slow=head;
        ListNode fast=cur;

        while(fast.next!=null){
            prev2=slow;
            slow=slow.next;
            fast=fast.next;
        }

        if(cur==slow){
            return dummy.next;
        }

        prev1.next=slow;
        prev2.next=cur;

        ListNode temp=cur.next;
        cur.next=slow.next;
        slow.next=temp;
        
        return dummy.next;
    }
}