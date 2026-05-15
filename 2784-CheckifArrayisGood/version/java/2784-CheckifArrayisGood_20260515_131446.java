// Last updated: 5/15/2026, 1:14:46 PM
1class Solution {
2    public boolean isGood(int[] nums) {
3        int n = nums.length;
4        int[] ans = new int[n];
5
6        for(int i : nums){
7            if(i >= n) return false;
8
9            if(i < n-1 && ans[i] > 0) return false;
10
11            if(i == n-1 && ans[i] > 1) return false;
12
13            ans[i]++;
14        }
15        return true;
16    }
17}