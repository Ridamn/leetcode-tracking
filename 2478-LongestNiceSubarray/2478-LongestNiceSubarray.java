// Last updated: 6/17/2026, 8:43:16 AM
class Solution {
    public int longestNiceSubarray(int[] nums) {
        int j=0;
        int max=0;
        int sum = 0;

        for(int i=0; i<nums.length; i++){
            // sum += nums[i];
            while((sum & nums[i]) != 0){
                sum ^= nums[j];
                j++;
            }
            sum |= nums[i];
            max = Math.max(max, i-j+1);
        }
        return max;
    }
}