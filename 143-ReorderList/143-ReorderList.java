// Last updated: 5/11/2026, 9:58:55 AM
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
    public void reorderList(ListNode head) {
        if(head == null || head.next == null || head.next.next == null) return;
        ListNode p1 = head;
        ListNode p2 = head;
        

        while (p2.next != null  &&  p2.next.next != null){
            p1 = p1.next;
            p2 = p2.next.next;
        }

        ListNode sec = p1.next;
        p1.next = null;

        ListNode pev = null;
        ListNode cur = sec;
        while(cur != null){
            ListNode nex = cur.next;
            cur.next = pev;
            pev = cur;
            cur = nex;
        }
        
        ListNode temp = head;
        sec = pev;

        while(sec != null){
            ListNode t1 = temp.next;
            ListNode t2 = sec.next;

            temp.next = sec;
            sec.next = t1;

            temp = t1;
            sec = t2;
        }
            
    }
}