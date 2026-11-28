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
    public ListNode removeNodes(ListNode head) {
        head= reverse(head);

        ListNode cur= head;
        int maxSofar= cur.val;

        while(cur.next!=null){

            if(cur.next.val < maxSofar){
                cur.next=cur.next.next;
            }
            else{
                cur=cur.next;
                maxSofar=cur.val;
            }
        }
        return reverse(head);
    }
    public ListNode reverse(ListNode head){
        ListNode prev= null;
        ListNode cur=head;

        while(cur!=null){
            ListNode nextTemp = cur.next;
            cur.next = prev;
            prev = cur;
            cur = nextTemp;
        }
        return prev;
    }
}