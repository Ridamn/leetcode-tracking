// Last updated: 5/11/2026, 9:54:49 AM
class Solution {
    public int subarraySum(int[] nums) {
        int n= nums.length;
        int t = 0;
        for(int i=0; i<n; i++){
            int start = Math.max(0, i-nums[i]);
            for(int j=start; j<=i; j++){
                t += nums[j];
            }
        }
        return t;
    }
}