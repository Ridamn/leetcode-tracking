// Last updated: 5/20/2026, 9:34:17 AM
1class Solution {
2    public int minDays(int[] bloomDay, int m, int k) {
3        if((long)m*k > bloomDay.length) return -1;
4
5        int ans = 0;
6        int p1 = 0;
7        int p2 = Integer.MAX_VALUE;
8
9        while(p1<=p2){
10            int mid = p1 + (p2-p1)/2;
11
12            if(check(bloomDay, m, k, mid)){
13                ans = mid;
14                p2 = mid-1;
15            }else p1 = mid+1;
16        }
17        return ans;
18    }
19    public boolean check(int[] nums, int m, int k, int mid){
20        int c=0;
21        int b=0;
22
23        for(int i : nums){
24            if(i <= mid){
25                c++;
26            }
27            else c=0;
28
29            if(c == k){
30                b++;
31                c=0;
32            }
33        }
34        return b>=m;
35    }
36}