// Last updated: 6/24/2026, 8:01:05 AM
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
12
13    public ListNode reverse(ListNode head){
14        ListNode prev = null;
15        while(head != null){
16            ListNode next = head.next;
17            head.next = prev;
18            prev = head;
19            head = next;
20        }
21        return prev;
22    }
23
24    public boolean isPalindrome(ListNode head) {
25        ListNode slow=head;
26        ListNode fast=head;
27        while(fast != null && fast.next != null){
28            slow = slow.next;
29            fast = fast.next.next;
30        }
31
32        if(fast != null) slow = slow.next;
33
34        ListNode second = reverse(slow);
35        ListNode first = head;
36
37        while(second != null){
38            if(second.val != first.val) return false;
39            second = second.next;
40            first = first.next;
41        }
42        return true;
43    }
44}