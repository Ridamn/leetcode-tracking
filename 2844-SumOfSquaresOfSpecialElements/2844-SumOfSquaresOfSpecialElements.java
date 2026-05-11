// Last updated: 5/11/2026, 9:55:17 AM
class Solution {
    public int sumOfSquares(int[] nums) {
        int n=0;
        for(int i=0; i<nums.length; i++) if(nums.length % (i+1)==0) n += Math.pow(nums[i], 2);
        return n;
    }
}