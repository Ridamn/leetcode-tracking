// Last updated: 5/11/2026, 9:55:42 AM
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
    public ListNode mergeNodes(ListNode head) {
        ListNode dummy = new ListNode(-1);
        ListNode dummyHead = dummy;

        int n = 0;
        ListNode curr = head.next;
        while(curr != null){
            if(curr.val != 0){
                n += curr.val;
            }
            else{
                ListNode temp = new ListNode(n);
                dummy.next = temp;
                dummy = dummy.next;
                n = 0;
            }
            curr = curr.next;
        }
        return dummyHead.next;
    }
}