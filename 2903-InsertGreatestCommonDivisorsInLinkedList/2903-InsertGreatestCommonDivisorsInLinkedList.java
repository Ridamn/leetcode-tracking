// Last updated: 5/11/2026, 9:55:16 AM
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
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        if(head.next == null) return head;
        ListNode newHead = head;

        ListNode temp = head.next;
        while(temp != null){
            int n= gcd(head.val, temp.val);
            ListNode node = new ListNode(n);

            head.next = node;
            node.next = temp;

            head = temp;
            temp = temp.next;
        }
        return newHead;
    }
    public int gcd(int a, int b){
        while(b != 0){
            int temp = b;
            b = a%b;
            a = temp;
        }
        return a;
    }
}