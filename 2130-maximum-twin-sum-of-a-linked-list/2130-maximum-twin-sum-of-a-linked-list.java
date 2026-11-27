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
    int k = 0;

    public int pairSum(ListNode head) {
        ListNode dummy = head;          
        ListNode temp = reverse(head); 
        int max = 0;

        for (int i = 0; i < k / 2; i++) {
            max = Math.max(max, temp.val + dummy.val);
            temp = temp.next;
            dummy = dummy.next;
        }
        return max;
    }

    public ListNode reverse(ListNode head) {
        ListNode prev = null;
        ListNode cur = head;

        while (cur != null) {
            ListNode newNode = new ListNode(cur.val); 
            newNode.next = prev;
            prev = newNode;
            cur = cur.next;
            k++;
        }

        return prev;
    }
}
