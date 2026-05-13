// Last updated: 5/13/2026, 8:09:00 AM
1class Solution {
2    public int singleNonDuplicate(int[] nums) {
3        int p1 = 0;
4        int p2 = nums.length-1;
5
6        while(p1<p2){
7            int mid = p1 + (p2-p1)/2;
8
9            if(mid % 2 == 1) mid--;
10            if(nums[mid] == nums[mid+1]) p1 = mid+2;
11            else p2 = mid;
12        }
13        return nums[p1];
14    }
15}