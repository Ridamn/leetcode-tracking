// Last updated: 5/11/2026, 9:55:54 AM
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
    public ListNode deleteMiddle(ListNode head) {
        if(head.next == null) return null;
        ListNode temp = head;
        int size = 0;
        
        while(temp.next != null){
            temp = temp.next;
            size++;
        }

        if(size%2 == 0){
            size = size/2;
            size--;
        }
        else{
            size = size/2;
        }

        temp = head;
        for(int i=0; i<size; i++){
            temp = temp.next;
        }
        temp.next = temp.next.next;

        return head;
    }
}