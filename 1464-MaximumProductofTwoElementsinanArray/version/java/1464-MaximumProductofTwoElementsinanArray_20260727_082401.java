// Last updated: 7/27/2026, 8:24:01 AM
1class Solution {
2    public int maxProduct(int[] nums) {
3        int max=Integer.MIN_VALUE;
4        for(int i=0; i<nums.length; i++){
5            for(int j=i+1; j<nums.length; j++){
6                int curr_max=0;
7                if(i != j) curr_max=(nums[i]-1)*(nums[j]-1);
8                max = Math.max(max, curr_max);
9
10            }
11        }
12        return max;
13    }
14}