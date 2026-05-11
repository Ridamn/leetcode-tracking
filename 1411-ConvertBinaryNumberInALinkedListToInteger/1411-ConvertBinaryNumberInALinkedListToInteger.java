// Last updated: 5/11/2026, 9:56:35 AM
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
    public int getDecimalValue(ListNode head) {
        int n=0;
        while(head != null){
            n *= 2;
            n += head.val;
            head = head.next;
        }
        return n;
    }
}