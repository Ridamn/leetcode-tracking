// Last updated: 6/12/2026, 1:23:30 PM
1class Solution {
2    public boolean predictTheWinner(int[] nums) {
3        int p1=0;
4        int p2=nums.length-1;
5        return helper(nums, p1, p2) >= 0;
6    }
7
8
9    public int helper(int[] arr, int p1, int p2){
10        if(p1 == p2) return arr[p1];
11        return Math.max(arr[p1]-helper(arr, p1+1, p2), arr[p2]-helper(arr, p1, p2-1));
12    }
13}