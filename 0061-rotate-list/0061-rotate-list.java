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
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null || k==0 || head.next==null){
            return head;
        }
        int l=0;
        ListNode list= head;
        while(head!=null){
            head=head.next;
            l++;
        }
        k=k%l;
        if(k==0){
            return list;
        }
        for(int i=1;i<=k;i++){
              list=rotate(list);
        }

        return list;
    }
    public ListNode rotate(ListNode head){
        ListNode dummy=new ListNode(0);
        dummy.next=head;
        while(dummy.next.next!=null){
            dummy=dummy.next;
        }
        ListNode dum=dummy.next;
        dummy.next=null;
        dum.next=head;
        
        return dum;
    }
    
}