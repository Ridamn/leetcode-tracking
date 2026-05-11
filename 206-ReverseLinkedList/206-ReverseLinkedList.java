// Last updated: 5/11/2026, 9:58:32 AM
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
    public ListNode reverseList(ListNode head) {
        ListNode p1 = null;
        ListNode p2 = head;
        ListNode p3 = null;
        while (p2 != null){
            p1 = p3;
            p3 = p2;
            p2 = p2.next;
            p3.next = p1;
        }

        return p3;
    }
}