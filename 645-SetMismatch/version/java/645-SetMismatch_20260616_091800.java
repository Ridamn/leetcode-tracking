// Last updated: 6/16/2026, 9:18:00 AM
1class Solution {
2    public int[] findErrorNums(int[] nums) {
3        Arrays.sort(nums);
4        int[] ans = new int[2];
5        int c=0;
6
7        for(int i=0; i<nums.length-1; i++){
8            if(nums[i] == nums[i+1]){
9                ans[0] = nums[i];
10                break;
11            }
12        }
13        for(int i=0; i<nums.length; i++){
14            c += nums[i];
15        }
16        
17        int n=nums.length;
18        int total = n*(n+1)/2;
19        ans[1] = total - (c - ans[0]);
20        return ans;
21    }
22}