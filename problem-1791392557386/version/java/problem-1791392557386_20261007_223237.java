// Last updated: 10/7/2026, 10:32:37 PM
1class Solution {
2    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
3
4        Stack<Integer> st1 = new Stack<>();
5        Stack<Integer> st2 = new Stack<>();
6
7        ListNode temp = l1;
8        while (temp != null) {
9            st1.push(temp.val);
10            temp = temp.next;
11        }
12
13        temp = l2;
14        while (temp != null) {
15            st2.push(temp.val);
16            temp = temp.next;
17        }
18
19        int carry = 0;
20        ListNode ans = null;
21
22        while (!st1.isEmpty() || !st2.isEmpty() || carry != 0) {
23
24            int sum = carry;
25
26            if (!st1.isEmpty()) {
27                sum += st1.pop();
28            }
29
30            if (!st2.isEmpty()) {
31                sum += st2.pop();
32            }
33
34            int digit = sum % 10;
35            carry = sum / 10;
36
37            ListNode node = new ListNode(digit);
38            node.next = ans;
39            ans = node;
40        }
41
42        return ans;
43    }
44}