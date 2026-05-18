// Last updated: 5/18/2026, 9:37:19 AM
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
12    public int pairSum(ListNode head) {
13        ListNode slow = head;
14        ListNode fast = head;
15        int maxVal = 0;
16
17        while (fast != null && fast.next != null) {
18            slow = slow.next;
19            fast = fast.next.next;
20        }
21
22        ListNode nextNode, prev = null;
23        while (slow != null) {
24            nextNode = slow.next;
25            slow.next = prev;
26            prev = slow;
27            slow = nextNode;
28        }
29
30        while (prev != null) {
31            maxVal = Math.max(maxVal, head.val + prev.val);
32            prev = prev.next;
33            head = head.next;
34        }
35
36        return maxVal;
37    }
38}