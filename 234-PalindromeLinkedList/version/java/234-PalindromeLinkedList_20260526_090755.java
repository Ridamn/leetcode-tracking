// Last updated: 5/26/2026, 9:07:55 AM
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
12    public boolean isPalindrome(ListNode head) {
13        Stack<Integer> st = new Stack<>();
14
15        ListNode temp = head;
16
17        while(temp != null){
18            st.push(temp.val);
19            temp = temp.next;
20        }
21
22        while(head != null){
23            if(head.val != st.pop()) return false;
24            head = head.next;
25        }
26
27        return true;
28    }
29}