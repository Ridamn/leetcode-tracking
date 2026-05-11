// Last updated: 5/11/2026, 9:54:37 AM
class Solution {
    public int minOperations(int[] nums, int k) {
        int c=0;
        for(int i=0; i<nums.length; i++){
            int r = nums[i] % k;
            c += r;
        }
        return c%k;

    }
}