// Last updated: 5/11/2026, 9:59:24 AM
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
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null)
        return null;
        
        ListNode temp = head;
        ListNode different = head.next;
        while(different!=null){
            if(temp.val != different.val){
                temp = temp.next;
                temp.val = different.val;
            }
            different = different.next;
        }
        temp.next = null;
        return head;
    }
}