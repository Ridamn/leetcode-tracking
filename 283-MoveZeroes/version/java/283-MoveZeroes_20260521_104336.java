// Last updated: 5/21/2026, 10:43:36 AM
1class Solution {
2    public void moveZeroes(int[] nums) {
3        int p1=0;
4        for(int p2=0; p2<nums.length; p2++){
5            if(nums[p2] != 0){
6                nums[p1] = nums[p2];
7                p1++;
8            }
9        }
10        while(p1<nums.length){
11            nums[p1]=0;
12            p1++;
13        }
14    }
15}