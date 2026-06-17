// Last updated: 6/17/2026, 8:42:58 AM
class Solution {
    public boolean isGood(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];

        for(int i : nums){
            if(i >= n) return false;

            if(i < n-1 && ans[i] > 0) return false;

            if(i == n-1 && ans[i] > 1) return false;

            ans[i]++;
        }
        return true;
    }
}