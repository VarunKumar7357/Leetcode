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
    public ListNode reverseEvenLengthGroups(ListNode head) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode groupPrev = dummy;

        // Outer for-loop increments group size k = 1, 2, 3... until list ends
        for (int k = 1; groupPrev.next != null; k++) {
            ListNode check = groupPrev;
            int actualLen = 0;

            // Count actual nodes available up to k
            while (actualLen < k && check.next != null) {
                check = check.next;
                actualLen++;
            }

            // Reverse if actual length is even
            if (actualLen % 2 == 0) {
                ListNode prev = groupPrev.next;
                ListNode cur = prev.next;

                for (int i = 1; i < actualLen; i++) {
                    prev.next = cur.next;
                    cur.next = groupPrev.next;
                    groupPrev.next = cur;
                    cur = prev.next;
                }
                groupPrev = prev; // Move to new tail
            } else {
                groupPrev = check; // Skip odd group; check is already at its tail
            }
        }

        return dummy.next;
    }
}
