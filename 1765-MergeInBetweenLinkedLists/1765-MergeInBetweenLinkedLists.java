// Last updated: 5/11/2026, 9:56:16 AM
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
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode tail2 = list2;

        while(tail2.next != null){
            tail2 = tail2.next;
        }

        ListNode listA = list1;
        ListNode listB = list1;

        for(int i=1; i<a; i++){
            listA = listA.next;
        }
        for(int i=0; i<=b; i++){
            listB = listB.next;
        }

        listA.next = list2;
        tail2.next = listB;

        return list1;
    }
}