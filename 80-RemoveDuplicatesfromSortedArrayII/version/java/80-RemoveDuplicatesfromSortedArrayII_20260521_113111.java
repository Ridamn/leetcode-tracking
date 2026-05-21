// Last updated: 5/21/2026, 11:31:11 AM
1class Solution {
2    public int maxArea(int[] height) {
3        int ans = 0;
4        int p1 = 0;
5        int p2 = height.length - 1;
6
7        while (p1 < p2) {
8            int c =  Math.min(height[p1], height[p2]) * (p2-p1);
9
10            ans = Math.max(ans, c);
11
12            if (height[p1] < height[p2]) {
13                p1++;
14            } else {
15                p2--;
16            }
17        }
18
19        return ans;
20    }
21}