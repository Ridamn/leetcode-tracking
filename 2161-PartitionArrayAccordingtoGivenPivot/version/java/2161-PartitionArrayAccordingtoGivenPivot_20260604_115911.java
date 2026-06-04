// Last updated: 6/4/2026, 11:59:11 AM
1class Solution {
2    public int minElement(int[] nums) {
3        int ans= Integer.MAX_VALUE;
4        int sum=0;
5
6        for(int i : nums){
7            while(i > 0){
8                int n=i%10;
9                sum += n;
10                i /= 10;
11            }
12            ans = Math.min(ans, sum);
13            sum = 0;
14        }
15        return ans;
16    }
17}