// Last updated: 7/16/2026, 8:06:33 AM
1class Solution {
2    public int minSubArrayLen(int target, int[] nums) {
3        int i=0;
4        int ans=Integer.MAX_VALUE;
5        int min=0;
6
7        for(int j=0; j<nums.length; j++){
8            min += nums[j];
9
10            while(min >= target){
11                min -= nums[i];
12                ans = Math.min(ans, j-i+1);
13                i++;
14            }
15        }
16        return ans == Integer.MAX_VALUE ? 0 : ans;
17    }
18}