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

        if(head==null || k==1){
            return head;
        }

        ListNode dummy= new ListNode(0);
        dummy.next=head;
        ListNode grouprev= dummy;

        while(true){
            ListNode check= grouprev;

            for(int i=0;i<k;i++){
                check=check.next;
                if(check==null){
                    return dummy.next;
                }
            }

            ListNode prev= grouprev.next;
            ListNode cur= prev.next;

            for (int i = 1; i < k; i++) {
                prev.next = cur.next;
                cur.next = grouprev.next;
                grouprev.next = cur;
                cur = prev.next;
            }
            grouprev = prev;
        }
        
    }
}