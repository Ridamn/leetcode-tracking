// Last updated: 6/6/2026, 9:26:07 AM
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
12    public int[][] spiralMatrix(int m, int n, ListNode head) {
13        int[][] mat = new int[m][n];
14        
15        for(int[] i : mat) Arrays.fill(i, -1);
16
17        int top=0;
18        int bottom=mat.length-1;
19        int left=0;
20        int right=mat[0].length-1;
21
22        while (left <= right && top <= bottom && head != null){
23            for (int j = left; j <= right; j++) {
24                if(head != null){
25                    mat[top][j] = head.val;
26                    head = head.next;
27                }
28            }
29            top++;
30
31            for (int i = top; i <= bottom; i++) {
32                if(head != null){
33                    mat[i][right] = head.val;
34                    head = head.next;
35                }
36            }
37            right--;
38
39            if (top <= bottom) {
40                for (int j = right; j >= left; j--) {
41                    if(head != null){
42                        mat[bottom][j] = head.val;
43                        head = head.next;
44                    }
45                }
46                bottom--; 
47            }
48
49            if (left <= right) {
50                for (int i = bottom; i >= top; i--) {
51                    if(head != null){
52                        mat[i][left] = head.val;
53                        head = head.next;
54                    }
55                }
56                left++;
57            }
58        }
59        return mat;
60    }
61}