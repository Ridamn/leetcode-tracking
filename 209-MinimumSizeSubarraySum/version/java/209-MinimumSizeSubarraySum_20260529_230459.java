// Last updated: 5/29/2026, 11:04:59 PM
1class Solution {
2    public int minSubArrayLen(int target, int[] nums) {
3        int j=0;
4        int ans=Integer.MAX_VALUE;
5        int sum=0;
6
7        for(int i=0; i<nums.length; i++){
8            sum += nums[i];
9            while(sum >= target){
10                ans = Math.min(ans, i-j+1);
11                sum -= nums[j];
12                j++;
13            }
14        }
15        if(ans==Integer.MAX_VALUE) return 0;
16        return ans;
17    }
18}