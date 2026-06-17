// Last updated: 6/17/2026, 8:43:19 AM
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
    public int[][] spiralMatrix(int m, int n, ListNode head) {
        int[][] mat = new int[m][n];
        
        for(int[] i : mat) Arrays.fill(i, -1);

        int top=0;
        int bottom=mat.length-1;
        int left=0;
        int right=mat[0].length-1;

        while (left <= right && top <= bottom && head != null){
            for (int j = left; j <= right; j++) {
                if(head != null){
                    mat[top][j] = head.val;
                    head = head.next;
                }
            }
            top++;

            for (int i = top; i <= bottom; i++) {
                if(head != null){
                    mat[i][right] = head.val;
                    head = head.next;
                }
            }
            right--;

            if (top <= bottom) {
                for (int j = right; j >= left; j--) {
                    if(head != null){
                        mat[bottom][j] = head.val;
                        head = head.next;
                    }
                }
                bottom--; 
            }

            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    if(head != null){
                        mat[i][left] = head.val;
                        head = head.next;
                    }
                }
                left++;
            }
        }
        return mat;
    }
}