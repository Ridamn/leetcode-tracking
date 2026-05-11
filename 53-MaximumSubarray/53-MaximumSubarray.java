// Last updated: 5/11/2026, 9:59:39 AM
class Solution {
    public int maxSubArray(int[] nums) {
        int n=0;
        int max = Integer.MIN_VALUE;
        for(int i : nums){
            n += i;
            max = Math.max(n , max);
            if(n < 0) n = 0;
        }
        return max;
    }
}