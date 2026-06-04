// Last updated: 6/4/2026, 11:41:09 AM
1class Solution {
2    public int[] concatWithReverse(int[] nums) {
3        int n=nums.length;
4        int[] arr = new int[n*2];
5
6        for(int i=0; i<n; i++){
7            arr[i] = nums[i];
8            arr[i+n] = nums[n-i-1];
9        }
10        return arr;
11    }
12}