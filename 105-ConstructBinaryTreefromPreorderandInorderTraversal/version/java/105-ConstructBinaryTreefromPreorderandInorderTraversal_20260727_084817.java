// Last updated: 7/27/2026, 8:48:17 AM
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
17    static int index=0;
18    static TreeNode buildTree(int[] preorder, int[] inorder) {
19        index=0;
20        createMapping(inorder);
21        return createTree(preorder, inorder, 0, inorder.length-1);
22    }
23
24    static Map<Integer, Integer> mp = new HashMap<>();
25    
26    static void createMapping(int[] inorder){
27        for(int i=0; i<inorder.length; i++){
28            mp.put(inorder[i], i);
29        }
30    }
31
32    static TreeNode createTree(int[] preorder, int[] inorder, int start, int end){
33        if(start > end) return null;
34        int rootdata = preorder[index++];
35        TreeNode root = new TreeNode(rootdata);
36        int pos = mp.get(rootdata);
37        root.left = createTree(preorder, inorder, start, pos-1);
38        root.right = createTree(preorder, inorder, pos+1, end);
39        return root;
40    }
41}