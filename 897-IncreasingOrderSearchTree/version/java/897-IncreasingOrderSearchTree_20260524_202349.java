// Last updated: 5/24/2026, 8:23:49 PM
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
17        public TreeNode increasingBST(TreeNode root) {
18        return increasingBST(root, null);
19    }
20
21    public TreeNode increasingBST(TreeNode root, TreeNode tail) {
22        if (root == null) return tail;
23        TreeNode res = increasingBST(root.left, root);
24        root.left = null;
25        root.right = increasingBST(root.right, tail);
26        return res;
27    }
28}