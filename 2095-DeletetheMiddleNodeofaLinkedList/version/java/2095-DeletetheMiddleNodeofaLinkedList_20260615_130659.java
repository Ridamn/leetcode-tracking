// Last updated: 6/15/2026, 1:06:59 PM
1/**
2 * Definition for singly-linked list.
3 * public class ListNode {
4 *     int val;
5 *     ListNode next;
6 *     ListNode() {}
7 *     ListNode(int val) { this.val = val; }
8 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
9 * }
10 */
11class Solution {
12    public ListNode deleteMiddle(ListNode head) {
13
14        if(head == null || head.next == null) return null;
15
16        ListNode p1 = head;
17        ListNode p2 = head;
18        ListNode prev = null;
19
20        while(p2 != null && p2.next != null){
21            prev = p1;
22            p1 = p1.next;
23            p2 = p2.next.next;
24        }
25        prev.next = p1.next;
26
27        return head;
28    }
29}