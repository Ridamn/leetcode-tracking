// Last updated: 6/27/2026, 8:45:17 AM
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
12    public ListNode sortList(ListNode head) {
13        if(head == null || head.next == null) return head;
14
15        ListNode slow = head;
16        ListNode fast = head;
17        ListNode prev = null;
18        while(fast != null && fast.next != null){
19            prev = slow;
20            slow = slow.next;
21            fast = fast.next.next;
22        }
23        prev.next = null;
24        ListNode list1 = sortList(head);
25        ListNode list2 = sortList(slow);
26
27        return merge(list1, list2);
28        
29    }
30    public ListNode merge(ListNode list1, ListNode list2){
31        ListNode temp = new ListNode(0);
32        ListNode curr = temp;
33
34        while(list1 != null && list2 != null){
35            if(list1.val < list2.val){
36                curr.next = list1;
37                list1 = list1.next;
38            }else{
39                curr.next = list2;
40                list2 = list2.next;
41            }
42            curr = curr.next;
43        }
44        if(list1 != null) curr.next = list1;
45        if(list2 != null) curr.next = list2;
46
47        return temp.next;
48    }
49    // public ListNode merge(ListNode head, ListNode tail){
50    //     ListNode pivot = head;
51    //     ListNOde curr = head;
52    //     ListNode prev = head;
53
54    //     while(curr != tail.next){
55    //         if(curr.val < pivot.val){
56    //             prev = prev.next;
57
58    //             int temp = curr.val;
59    //             curr.val = prev.val;
60    //             prev.val = temp;
61    //         }
62    //         curr = curr.next;
63    //     }
64    //     int temp = pivot.val;
65    //     pivot.val = prev.val;
66    //     prev.val = temp;
67
68    //     return prev;
69    // }
70}