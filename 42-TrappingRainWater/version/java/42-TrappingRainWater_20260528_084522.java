// Last updated: 5/28/2026, 8:45:22 AM
1class Solution {
2    public int trap(int[] height) {
3        int n = height.length;
4
5    int[] leftmax = new int[n];
6    leftmax[0] = height[0];
7
8    int[] rightmax = new int[n];
9    rightmax[n - 1] = height[n - 1];
10
11    for (int i = 1; i < n; i++) {
12        leftmax[i] = Math.max(leftmax[i - 1], height[i]);
13    }
14
15    for (int i = n - 2; i >= 0; i--) {
16        rightmax[i] = Math.max(rightmax[i + 1], height[i]);
17    }
18
19    int ans=0;
20
21    for(int i=0; i<n; i++){
22        ans += Math.min(leftmax[i], rightmax[i])-height[i];
23    }
24    return ans;
25
26        
27    }
28}