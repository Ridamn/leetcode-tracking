// Last updated: 7/22/2026, 11:15:38 AM
1/**
2 * Definition for a binary tree node.
3 * public class TreeNode {
4 *     int val;
5 *     TreeNode left;
6 *     TreeNode right;
7 *     TreeNode() {}
8 *     TreeNode(int val) { this.val = val; }
9 *     TreeNode(int val, TreeNode left, TreeNode right) {
10 *         this.val = val;
11 *         this.left = left;
12 *         this.right = right;
13 *     }
14 * }
15 */
16class Solution {
17    public Boolean bal = true;
18    public boolean isBalanced(TreeNode root) {
19        dfs(root);
20        return bal;
21    }
22
23    public int dfs(TreeNode root){
24        if(root == null) return 0;
25
26        if(!bal) return 0;
27
28        int left = dfs(root.left);
29        int right = dfs(root.right);
30
31        if(Math.abs(left-right)> 1){
32            bal = false;
33        }
34        return Math.max(left, right)+1;
35    }
36
37}