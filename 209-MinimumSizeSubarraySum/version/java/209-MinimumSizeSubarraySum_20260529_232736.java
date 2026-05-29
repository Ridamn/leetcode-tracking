// Last updated: 5/29/2026, 11:27:36 PM
1class Solution {
2    public int longestOnes(int[] nums, int k) {
3        int j=0;
4        int ans=0;
5        int c=0;
6
7        for(int i=0; i<nums.length; i++){
8            if(nums[i] == 0) c++;
9            while(c > k){
10                if(nums[j]==0) c--;
11                j++;
12            }
13            ans=Math.max(ans, i-j+1);
14        }
15        return ans;
16    }
17}