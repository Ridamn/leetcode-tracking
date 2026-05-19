// Last updated: 5/19/2026, 8:48:59 AM
1class Solution {
2    public int minimumSize(int[] nums, int max) {
3        int p1 = 1;
4        int p2 = 0;
5
6        for(int i : nums) p2 = Math.max(p2, i);
7
8        while(p1 < p2){
9            int mid = p1 + (p2-p1)/2;
10
11            if(check(nums, max, mid)) p2 = mid;
12            else p1 = mid + 1;
13        }
14        return p1;
15    }
16    public boolean check(int[] nums, int max, int mid){
17        int total = 0;
18
19        for(int i : nums){
20            int c = (i-1)/mid;
21            total += c;
22
23            if(total > max) return false;
24        }
25        return true;
26    }
27}