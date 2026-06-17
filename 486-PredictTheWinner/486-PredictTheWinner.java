// Last updated: 6/17/2026, 8:45:40 AM
class Solution {
    public boolean predictTheWinner(int[] nums) {
        int p1=0;
        int p2=nums.length-1;
        return helper(nums, p1, p2) >= 0;
    }


    public int helper(int[] arr, int p1, int p2){
        if(p1 == p2) return arr[p1];
        return Math.max(arr[p1]-helper(arr, p1+1, p2), arr[p2]-helper(arr, p1, p2-1));
    }
}