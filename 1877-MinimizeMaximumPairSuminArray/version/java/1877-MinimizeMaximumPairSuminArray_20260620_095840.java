// Last updated: 6/20/2026, 9:58:40 AM
1class Solution {
2    public int minPairSum(int[] nums) {
3        Arrays.sort(nums);
4        int ans = Integer.MIN_VALUE;
5
6        int p1=0;
7        int p2=nums.length-1;
8
9        while(p1<p2){
10            int cur_sum = nums[p1] + nums[p2];
11            ans = Math.max(ans, cur_sum);
12            p1++;
13            p2--;
14        }
15        return ans;
16    }
17}