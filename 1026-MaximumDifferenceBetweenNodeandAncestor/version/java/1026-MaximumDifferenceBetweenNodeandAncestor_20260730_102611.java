// Last updated: 7/30/2026, 10:26:11 AM
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
17    int ans=Integer.MIN_VALUE;
18    public int maxAncestorDiff(TreeNode root) {
19        solve(root, root.val, root.val);
20        return ans;
21    }
22
23    public void solve(TreeNode root, int max, int min){
24        if(root == null) return;
25        max = Math.max(max, root.val);
26        min = Math.min(min, root.val);
27        ans = Math.max(ans, max-min);
28        solve(root.left,max, min);
29        solve(root.right, max, min);
30    }
31}