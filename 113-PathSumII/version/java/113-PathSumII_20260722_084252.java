// Last updated: 7/22/2026, 8:42:52 AM
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
17    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
18        List<List<Integer>> res = new ArrayList<>();
19        List<Integer> arr = new ArrayList<>();
20        solve(root, targetSum, res, arr);
21        return res;
22        
23
24    }
25    
26    public void solve(TreeNode root, int tg, List<List<Integer>> res, List<Integer> arr){
27        if(root == null) return;
28        tg -= root.val;
29        arr.add(root.val);
30        if(root.left == null && root.right == null && tg == 0){
31            res.add(new ArrayList<>(arr));
32        }
33        solve(root.left, tg, res, arr);
34        solve(root.right, tg, res, arr);
35        arr.remove(arr.size()-1);
36    }
37}